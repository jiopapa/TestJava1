package happy77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import happy77.service.member.MemberDetailService;
import happy77.service.member.MemberListService;

@Controller
public class MemberController {
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDetailService memberDetailService;
	
	@GetMapping("memberList")
	public String memberList(Model model) {
		memberListService.execute(model);
		return"thymeleaf/member/memberList";
	}
	@GetMapping("memberDetail")
	public String memberDetail(@RequestParam(value="memberNum") String memberNum, Model model ) {
		memberDetailService.execute(memberNum, model);
		return "thymeleaf/member/memberModify";
	}
}
