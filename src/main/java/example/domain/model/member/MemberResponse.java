package example.domain.model.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.ToString;

/**
 * ModelとDomainオブジェクトとの変換
 */
@Builder
@ToString
public class MemberResponse {

    @JsonProperty("id")
    private Integer memberNumber;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("mailAddress")
    private String mailAddress;
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    public static MemberResponse convert(Member member) {
        return MemberResponse.builder()
                .memberNumber(member.memberNumber().value())
                .fullName(member.fullName().value())
                .mailAddress(member.mailAddress().value())
                .phoneNumber(member.phoneNumber().value())
                .build();
    }
}
