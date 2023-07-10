package example.domain.model.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * メンバー番号
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class MemberNumber {

    private Integer value;

    public static MemberNumber from(String value) {
        return new MemberNumber(Integer.parseInt(value));
    }
}
