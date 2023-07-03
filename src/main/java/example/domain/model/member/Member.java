package example.domain.model.member;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * メンバー
 */
public class Member {
    Member member;
    @JsonProperty("memberNumber")  MemberNumber memberNumber;
    @JsonProperty("fullName") FullName fullName;
    @JsonProperty("mailAddress") MailAddress mailAddress;
    @JsonProperty("phoneNumber") PhoneNumber phoneNumber;

    @Deprecated
    public Member() {
        this(new MemberNumber(), new FullName(), new MailAddress(), new PhoneNumber());
    }

    public Member(MemberNumber memberNumber, FullName fullName, MailAddress mailAddress, PhoneNumber phoneNumber) {
        this.memberNumber = memberNumber;
        this.fullName = fullName;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
    }

    public MemberNumber memberNumber() {
        return memberNumber;
    }

    public FullName fullName() {
        return fullName;
    }

    public MailAddress mailAddress() {
        return mailAddress;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "member{" +
                "memberNumber=" + memberNumber +
                ", fullName=" + fullName +
                ", phoneNumber=" + phoneNumber +
                ", mailAddress=" + mailAddress +
                '}';
    }
}
