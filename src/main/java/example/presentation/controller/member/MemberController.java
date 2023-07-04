package example.presentation.controller.member;

import example.application.service.member.MemberQueryService;
import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * メンバーの詳細
 */
@RestController
@RequestMapping("/members/{memberNumber}")
public class MemberController {

    MemberQueryService memberQueryService;

    @GetMapping
    public void member(@PathVariable(value = "memberNumber") MemberNumber memberNumber) {
       Member member = memberQueryService.choose(memberNumber);
       return;
    }

    public MemberController(MemberQueryService memberQueryService) {
        this.memberQueryService = memberQueryService;
    }
}
