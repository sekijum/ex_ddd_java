package example.infrastructure.datasource.member;

import example.domain.model.member.Member;
import example.domain.model.member.MemberNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

    Member selectByMemberNumber(@Param("memberNumber") MemberNumber memberNumber);
}
