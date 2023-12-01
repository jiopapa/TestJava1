package happy77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import happy77.command.MemberCommand;
import happy77.service.memberMyPage.MemberInfoService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("myPage")
public class MemberMyPageController {
	@Autowired
	MemberInfoService memberInfoService;
	
	@RequestMapping("myDetail")
	public String myDetail(HttpSession session, Model model) {
		memberInfoService.execute(session, model);
		return "thymeleaf/memberMy/memberMyInfo";
	}
	@PostMapping("memberUpdate")
	public String myDetail(@Validated MemberCommand memberCommand , 
			BindingResult result ,HttpSession session) {
		//memberInfoUpdateService.execute(memberCommand, session, result);
		if(result.hasErrors()) {
			return "thymeleaf/memberMy/memberMyInfo";
		}
		return "redirect:/";
	}
}
