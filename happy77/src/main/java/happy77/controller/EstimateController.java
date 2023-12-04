package happy77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import happy77.command.EstimateInquiryCommand;
import happy77.command.LoginCommand;
import happy77.service.estimateInquiry.InquiryInsertService;
import happy77.service.estimateInquiry.InquiryListService;
import happy77.service.memberMyPage.MemberInfoService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("estimate")
public class EstimateController {
	@Autowired
	MemberInfoService memberInfoService;
	@Autowired
	InquiryInsertService inquiryInsertService;
	@Autowired
	InquiryListService inquiryListService;
	
	@RequestMapping("contact")
	public String contact(@ModelAttribute("loginCommand") LoginCommand loginCommand,
			Model model ,HttpSession session
			, HttpServletRequest request) {
		memberInfoService.execute(session, model);
		return "thymeleaf/estimate/estimateInquiryForm";
	}
	@PostMapping("inquiryWrite")
	public String inquirySubmit(HttpSession session, EstimateInquiryCommand estimateInquiryCommand, Model model) {
		inquiryInsertService.execute(estimateInquiryCommand , session);
		inquiryListService.execute(session, model);
		return "thymeleaf/estimate/estimateInquiryList";
	}
		

}
