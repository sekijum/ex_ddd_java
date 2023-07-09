package example.infrastructure.datasource.member;

import example.application.repository.MemberRepository;
import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDataSource implements MemberRepository {
    @Autowired
    private MemberMapper mapper;

    @Override
    public Member choose(MemberNumber memberNumber) {
        return mapper.selectByMemberNumber(memberNumber);
    }
}
