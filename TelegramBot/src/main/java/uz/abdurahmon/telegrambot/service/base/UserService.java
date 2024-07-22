package uz.abdurahmon.telegrambot.service.base;


import uz.abdurahmon.telegrambot.entity.User;
import uz.abdurahmon.telegrambot.entity.dto.LoginDto;

import java.util.List;

public interface UserService {
    User getByChatId(Long chatId);

    void login(LoginDto loginDto);

    void save(User user);

    void deleteById(Long userId);

    String aboutMe(User user);

    List<User> getAdmins();
}
