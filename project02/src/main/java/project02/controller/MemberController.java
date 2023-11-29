package project02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping(value="member/memberList")
	public String memberList() {
		return "thymeleaf/member/memberList";
	}
	@RequestMapping("member/memberRegist")
	public String memberRegist() {
		return "thymeleaf/member/list";
	}
}
