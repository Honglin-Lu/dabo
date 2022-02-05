package tech.honglin.dashboard.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = true, length = 30)
    private String phone;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = true, length = 255)
    private String address;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

    @JsonFormat
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime created_at = LocalDateTime.now();

    @JsonFormat
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ")
    private LocalDateTime updated_at = LocalDateTime.now();

    public User getUser() {
        return user;
    }


}