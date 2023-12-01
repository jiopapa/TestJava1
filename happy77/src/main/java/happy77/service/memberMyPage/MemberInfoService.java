package happy77.service.memberMyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import happy77.command.MemberCommand;
import happy77.domain.AuthInfoDTO;
import happy77.domain.MemberDTO;
import happy77.mapper.MemberMyMapper;
import jakarta.servlet.http.HttpSession;

@Service
public class MemberInfoService {
	@Autowired
	MemberMyMapper memberMyMapper;
	public void execute(HttpSession session , Model model) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		String memberId = authInfo.getUserId();
		MemberDTO dto = memberMyMapper.memberInfo(memberId);
		MemberCommand memberCommand = new MemberCommand();
		memberCommand.setMemberId(dto.getMemberId());
		memberCommand.setBusinessAddr(dto.getBusinessAddr());
		memberCommand.setBusinessAddrDetail(dto.getBusinessAddrDetail());
		memberCommand.setBusinessItem(dto.getBusinessItem());
		memberCommand.setBusinessName(dto.getBusinessName());
		memberCommand.setBusinessPost(dto.getBusinessPost());
		memberCommand.setBusinessRegiNum(dto.getBusinessRegiNum());
		memberCommand.setBusinessTel(dto.getBusinessTel());
		memberCommand.setBusinessType(dto.getBusinessType());
		memberCommand.setMemberNum(dto.getMemberNum());
		memberCommand.setPicEmail(dto.getPicEmail());
		memberCommand.setPicName(dto.getPicName());
		memberCommand.setPicPhone(dto.getPicPhone());
		memberCommand.setRepresentativeName(dto.getRepresentativeName());
		model.addAttribute("memberCommand", memberCommand);
		
	}
}
