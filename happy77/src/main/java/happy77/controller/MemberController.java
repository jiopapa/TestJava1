package happy77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import happy77.service.member.MemberListService;

@Controller
public class MemberController {
	@Autowired
	MemberListService memberListService;
	
	@GetMapping("memberList")
	public String memberList(Model model) {
		memberListService.execute(model);
		return"thymeleaf/member/memberList";
	}
}
