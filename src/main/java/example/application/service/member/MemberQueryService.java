package example.application.service.member;

import example.application.repository.MemberRepository;
import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * メンバー参照サービス
 */
@Service
public class MemberQueryService {
    @Autowired
    MemberRepository memberRepository;

    /**
     * 主キー検索
     * メンバー選択
     */
    public Member choose(MemberNumber memberNumber) {
        return memberRepository.choose(memberNumber);
    }
}
