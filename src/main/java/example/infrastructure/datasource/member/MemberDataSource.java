package example.infrastructure.datasource.member;

import example.application.repository.MemberRepository;
import example.domain.model.member.*;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDataSource implements MemberRepository {
    MemberMapper mapper;

    @Override
    public Member choose(MemberNumber memberNumber) {
        return mapper.selectByMemberNumber(memberNumber);
    }

    public MemberDataSource(MemberMapper mapper) {
        this.mapper = mapper;
    }
}
