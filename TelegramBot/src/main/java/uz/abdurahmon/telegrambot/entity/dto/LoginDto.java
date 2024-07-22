package uz.abdurahmon.telegrambot.entity.dto;

import lombok.*;
import uz.abdurahmon.telegrambot.entity.enums.Language;
import uz.abdurahmon.telegrambot.entity.enums.UserRole;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    private String phoneNumber;
    private Long chatId;
    private String firstName;
    private String lastName;
    private Language language;
    private UserRole userRole;
}