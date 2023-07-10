package example.domain.model.member;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 電話番号
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {

    @NotBlank(message = "電話番号を入力してください")
    @Pattern(regexp = "([0-9]{2,4}-[0-9]{2,4}-[0-9]{2,4})?", message = "xx-xxxx-xxxxの形式で入力してください")
    @Size(min = 8, max = 13, message = "桁数は8桁以上13桁以下で入力してください")
    private String value = "";
}
