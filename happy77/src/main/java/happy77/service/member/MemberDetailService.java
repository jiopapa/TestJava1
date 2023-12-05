package happy77.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import happy77.command.MemberCommand;
import happy77.domain.MemberDTO;
import happy77.mapper.MemberMapper;

@Service
public class MemberDetailService {
	
	@Autowired
	MemberMapper memberMapper;
	
	public void execute(String memberNum, Model model) {
		
		
		MemberDTO dto = memberMapper.selectOne(memberNum);
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

