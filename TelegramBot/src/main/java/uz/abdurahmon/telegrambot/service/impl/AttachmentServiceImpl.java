package uz.abdurahmon.telegrambot.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.abdurahmon.telegrambot.entity.Attachment;
import uz.abdurahmon.telegrambot.entity.User;
import uz.abdurahmon.telegrambot.repository.AttachmentRepository;
import uz.abdurahmon.telegrambot.service.base.AttachmentService;

@Service
@RequiredArgsConstructor
public class AttachmentServiceImpl implements AttachmentService {
    private final AttachmentRepository attachmentRepository;

    @Override
    public Attachment save(String url, User user) {
        Attachment attachment = new Attachment();
        attachment.setLink(url);
        attachment.setUser(user);

        attachmentRepository.save(attachment);
        return attachment;
    }

    @Override
    public Attachment getById(Long attachmentId) {
        return attachmentRepository.findById(attachmentId).orElse(null);
    }

    @Override
    public void deleteById(Long attachmentId) {
        attachmentRepository.deleteById(attachmentId);
    }
}
