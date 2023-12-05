package happy77.service.memberMyPage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import happy77.domain.AuthInfoDTO;
import happy77.domain.EstimateInquiryDTO;
import happy77.mapper.MemberMapper;
import happy77.mapper.MemberMyMapper;
import jakarta.servlet.http.HttpSession;

@Service
public class MemberMyInquiryListService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	MemberMyMapper memberMyMapper;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		String memberId = auth.getUserId();
		String memberNum = memberMapper.getMemberNum(memberId);
	
	
		List<EstimateInquiryDTO>list =memberMyMapper.myInquiryList(memberNum);
		model.addAttribute("list", list);
	}
}
