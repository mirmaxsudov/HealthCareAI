package uz.abdurahmon.telegrambot.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.abdurahmon.telegrambot.entity.enums.Language;
import uz.abdurahmon.telegrambot.entity.enums.UserRole;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@SuppressWarnings("all")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Long chatId;
    private boolean isDeleted;
    @Enumerated(EnumType.STRING)
    private Language language;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
}