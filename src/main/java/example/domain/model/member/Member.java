package example.domain.model.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * メンバー
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private MemberNumber memberNumber;
    private FullName fullName;
    private MailAddress mailAddress;
    private PhoneNumber phoneNumber;
}
