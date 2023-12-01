package happy77.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import happy77.command.LoginCommand;
import happy77.domain.AuthInfoDTO;
import happy77.mapper.UserMapper;
import jakarta.servlet.http.HttpSession;

@Service
public class UserLoginService {
	@Autowired
	UserMapper userMapper;

	public void execute(LoginCommand loginCommand, HttpSession session, BindingResult result) {
		String userId = loginCommand.getUserId();
		String userPw = loginCommand.getUserPw();

		AuthInfoDTO dto = userMapper.loginSelect(userId);
		if (userId != "" && userId != null) {
			if (dto != null) {
				if (userPw.equals(dto.getUserPw())) {
					System.out.println("비밀번호가 일치합니다");
					session.setAttribute("auth", dto);
				} else{
					System.out.println("비밀번호가 일치하지 않습니다.");
					result.rejectValue("userPw", "loginCommand.userPw", "비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
				result.rejectValue("userId", "loginCommand.userId", "아이디가 존재하지 않습니다.");
			}
		}
	}
}
