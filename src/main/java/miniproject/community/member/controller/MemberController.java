package miniproject.community.member.controller;

import lombok.RequiredArgsConstructor;
import miniproject.community.member.model.MemberInput;
import miniproject.community.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor    // 생성자를 생략가능하게 해줌
@Controller
public class MemberController {

    private final MemberService memberService;    // 생성자 주입으로 repository 사용할수 있게

    @RequestMapping("/member/login")
    public String login() {
        return "member/login";
    }

    @GetMapping("/member/register")
    public String register() {
        return "member/register";
    }

    @PostMapping("/member/register")
    public String registerSubmit(Model model, MemberInput parameter) {

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complete";
    }

    @GetMapping("/member/info")
    public String memberInfo() {

        return "member/info";
    }
}
