package example.domain.model.member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 氏名
 */
public class FullName {

    final int 字数制限 = 40;
    @NotBlank(message = "名前を入力してください。")
    @Size(max = 字数制限, message = "{max}文字以内で入力してください。")
    String value = "";

    public FullName() {
    }

    public FullName(String fullName) {
        value = fullName;
    }

    @Override
    public String toString() {
        return value;
    }
}
