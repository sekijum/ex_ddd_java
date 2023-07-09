package example.presentation.controller.member;

import example.application.service.member.MemberQueryService;
import example.domain.model.member.MemberNumber;
import example.domain.model.member.MemberResponse;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * GET /members/{memberNumber} : メンバー情報取得API ログイン済のユーザ情報を取得する。
 */
@RestController
@RequestMapping("/members/{memberNumber}")
@ResponseBody
public class MemberController {

    @Autowired
    private MemberQueryService memberQueryService;

    @GetMapping()
    public ResponseEntity<MemberResponse> member(@PathVariable(value = "memberNumber") MemberNumber memberNumber) {
        val member = memberQueryService.choose(memberNumber);
        System.out.println(member.getFullName());
        return ResponseEntity.ok(MemberResponse.convert(member));
    }
}
