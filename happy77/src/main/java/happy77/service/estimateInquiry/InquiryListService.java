package happy77.service.estimateInquiry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import happy77.command.EstimateInquiryCommand;
import happy77.domain.AuthInfoDTO;
import happy77.domain.EstimateInquiryDTO;
import happy77.mapper.EstimateInquiryMapper;
import happy77.mapper.MemberMapper;
import jakarta.servlet.http.HttpSession;

@Service

public class InquiryListService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	EstimateInquiryMapper estimateInquiryMapper;
	
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		String memberId = auth.getUserId();
		String memberNum = memberMapper.getMemberNum(memberId);
	
	
		List<EstimateInquiryDTO>list =estimateInquiryMapper.inquiryList(memberNum);
		model.addAttribute("list", list);

	}

}
