package example.application.service.member;

import example.application.repository.MemberRepository;
import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.stereotype.Service;

/**
 * メンバー参照サービス
 */
@Service
public class MemberQueryService {

    MemberRepository memberRepository;

    /**
     * 主キー検索
     * メンバー選択
     */
    public Member choose(MemberNumber memberNumber) {
        return memberRepository.choose(memberNumber);
    }

    MemberQueryService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
