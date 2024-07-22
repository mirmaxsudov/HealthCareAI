package uz.abdurahmon.telegrambot.service.base;

import uz.abdurahmon.telegrambot.entity.Feedback;

public interface FeedbackService {
    void save(Feedback feedback);

    Feedback getById(Long feedbackId);

    void deleteById(Long feedbackId);
}
