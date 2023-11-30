package happy77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("estimate")
public class EstiateController {
	@RequestMapping("contact")
	public String contact() {
		return "thymeleaf/estimate/estimateInquiryForm";
	}

}
