package happy77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import happy77.command.MemberCommand;
import happy77.service.member.MemberAutoNumService;
import happy77.service.member.MemberInsertService;

@Controller
@RequestMapping("register")
public class RegisterController {
	@Autowired
	MemberAutoNumService memberAutoNumService;
	@Autowired
	MemberInsertService memberInsertService;

	
	@RequestMapping("userAgree")
	public String userAgree() {
		return "thymeleaf/memberRegist/userAgree";
	}
	@RequestMapping("userWrite")
	public String userWrite(Model model) {
		memberAutoNumService.execute(model);
		return "thymeleaf/memberRegist/memberForm";
	}
	@PostMapping("userRegist")
	public String userRegist(MemberCommand memberCommand, Model model) {
		memberInsertService.execute(memberCommand);
		return "redirect:/";
	}
	
}
