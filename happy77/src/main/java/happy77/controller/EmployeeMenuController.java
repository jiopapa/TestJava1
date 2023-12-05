package happy77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeMenuController {
	
	@RequestMapping("bizcheck")
	public String bizcheck() {
		return"thymeleaf/bizNumCheck";
	}
	@RequestMapping("chat")
	public String chat() {
		return"thymeleaf/chat";
	}

}
