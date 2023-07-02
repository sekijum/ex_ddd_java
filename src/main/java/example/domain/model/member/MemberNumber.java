package example.domain.model.member;

/**
 * メンバー番号
 */
public class MemberNumber {

    Integer value;

    public MemberNumber() {
    }

    public static MemberNumber from(String value) {
        return new MemberNumber(Integer.parseInt(value));
    }

    public MemberNumber(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
