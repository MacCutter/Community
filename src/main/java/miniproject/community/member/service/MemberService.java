package miniproject.community.member.service;

import miniproject.community.admin.dto.MemberDto;
import miniproject.community.admin.model.MemberParam;
import miniproject.community.member.model.MemberInput;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface MemberService extends UserDetailsService {

    boolean register(MemberInput parameter);

    /**
     * 회원 목록 리턴(관리자모드 에서만 사용 가능)
     */

    List<MemberDto> list(MemberParam parameter);
}
