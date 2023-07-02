package example.domain.model.member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 氏名
 */
public class Name {

    final int 字数制限 = 40;
    @NotBlank(message = "名前を入力してください。")
    @Size(max = 字数制限, message = "{max}文字以内で入力してください。")
    String value = "";

    public Name() {
    }

    public Name(String name) {
        value = name;
    }

    @Override
    public String toString() {
        return value;
    }
}
