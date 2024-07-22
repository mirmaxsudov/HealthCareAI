package uz.abdurahmon.telegrambot.service.base;

import uz.abdurahmon.telegrambot.entity.Attachment;
import uz.abdurahmon.telegrambot.entity.User;

public interface AttachmentService {
    Attachment save(String url, User user);

    Attachment getById(Long attachmentId);

    void deleteById(Long attachmentId);
}
