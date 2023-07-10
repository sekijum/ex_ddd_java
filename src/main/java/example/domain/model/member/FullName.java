package example.domain.model.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 氏名
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class FullName {

    @JsonIgnore
    private final int 字数制限 = 40;

    @NotBlank(message = "名前を入力してください。")
    @Size(max = 字数制限, message = "{max}文字以内で入力してください。")
    private String value = "";
}
