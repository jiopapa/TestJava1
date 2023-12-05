package happy77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import happy77.command.LoginCommand;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
		
	@RequestMapping("/")
	public String index(@ModelAttribute("loginCommand") LoginCommand loginCommand,
			Model model ,HttpSession session
			, HttpServletRequest request) {
		
		return "thymeleaf/index";
	}
	

}
