package example.domain.model.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * メンバー
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private MemberNumber memberNumber;
    private FullName fullName;
    private MailAddress mailAddress;
    private PhoneNumber phoneNumber;
}
