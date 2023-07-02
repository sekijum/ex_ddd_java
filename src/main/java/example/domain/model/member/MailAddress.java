package example.domain.model.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * メールアドレス
 */
public class MailAddress {

    @NotBlank(message = "メールアドレスを入力してください")
    @Email(message = "メールアドレスが正しくありません。")
    String value = "";

    public MailAddress() {
    }

    public MailAddress(String mailAddress) {
        value = mailAddress;
    }

    @Override
    public String toString() {
        return value;
    }
}
