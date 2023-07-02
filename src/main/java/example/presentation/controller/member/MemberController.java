package example.presentation.controller.member;

import example.application.service.member.MemberQueryService;
import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

/**
 * メンバーの詳細
 */
@RestController
@RequestMapping("members/{memberNumber}")
public class MemberController {

    MemberQueryService memberQueryService;

    public MemberController(MemberQueryService memberQueryService) {
        this.memberQueryService = memberQueryService;
    }

    @GetMapping
    public Member Member(@PathVariable(value = "memberNumber") MemberNumber memberNumber) {
        return memberQueryService.choose(memberNumber);
    }
}
