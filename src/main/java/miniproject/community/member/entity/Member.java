package miniproject.community.member.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Member {
    @Id
    private String userId;

    private String userName;
    private String email;
    private String password;
    private LocalDateTime regDt;

    private boolean adminYn;
}
