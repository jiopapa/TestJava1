package happy77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import happy77.command.LoginCommand;
import happy77.service.UserLoginService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	UserLoginService userLoginService;
	
	@RequestMapping("loginForm")
	public String loginForm(LoginCommand loginCommand, BindingResult result, HttpSession session) {
		return "thymeleaf/login/loginForm";
	}
	@PostMapping("login")
	public String login(LoginCommand loginCommand, BindingResult result, HttpSession session) {
		userLoginService.execute(loginCommand, session, result);
		if(result.hasErrors()) {
			return "thymeleaf/login/loginForm";
		}
			return "redirect:/";
			
	}
	@GetMapping("logout")
	public String logout(HttpSession session, HttpServletResponse response){
		Cookie cookie = new Cookie("autoLogin","");
		cookie.setPath("/");
		//수명주기
		cookie.setMaxAge(0);
		//사용자에게 전달
		response.addCookie(cookie);
		
		session.invalidate();
		return "redirect:/";
	}
	
}
