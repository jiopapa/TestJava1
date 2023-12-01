package happy77.command;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginCommand {
	@NotBlank(message = "아이디를 입력해 주세요.")
	String userId;
	@NotEmpty(message = "비밀번호를 입력해 주세요.")
	String userPw;
}
