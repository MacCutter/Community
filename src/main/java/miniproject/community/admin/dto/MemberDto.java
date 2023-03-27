package miniproject.community.admin.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberDto {

    String userId;

    String email;
    String password;
    LocalDateTime regDt;
    String userName;
    boolean adminYn;

    // 추가컬럼
    long totalCount;
    long seq;
}
