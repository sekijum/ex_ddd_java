package example.domain.model.member;

/**
 * メンバー
 */
public class Member {
    MemberNumber memberNumber;
    Member member;
    Name name;
    MailAddress mailAddress;
    PhoneNumber phoneNumber;

    @Deprecated
    public Member() {
        this(new MemberNumber(), new Name(), new MailAddress(), new PhoneNumber());
    }

    public Member(MemberNumber memberNumber, Name name, MailAddress mailAddress, PhoneNumber phoneNumber) {
        this.memberNumber = memberNumber;
        this.name = name;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
    }

    public MemberNumber memberNumber() {
        return memberNumber;
    }

    public Name name() {
        return name;
    }

    public MailAddress mailAddress() {
        return mailAddress;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + memberNumber +
                ", name=" + name +
                ", phoneNumber=" + phoneNumber +
                ", mailAddress=" + mailAddress +
                '}';
    }
}
