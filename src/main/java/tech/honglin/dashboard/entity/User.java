package tech.honglin.dashboard.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, length = 100)
    private String email;

    @JsonFormat
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime created_at = LocalDateTime.now();

    @JsonFormat
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime updated_at = LocalDateTime.now();


}