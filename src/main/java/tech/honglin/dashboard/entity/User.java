package tech.honglin.dashboard.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, length = 100)
    private String email;


    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime created_at = LocalDateTime.now();


    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime updated_at = LocalDateTime.now();


}