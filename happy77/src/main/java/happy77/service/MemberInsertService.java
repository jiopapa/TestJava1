package happy77.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import happy77.command.MemberCommand;
import happy77.domain.MemberDTO;
import happy77.mapper.MemberMapper;

@Service
public class MemberInsertService {
	@Autowired
	MemberMapper memberMapper;
	
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setBusinessAddr(memberCommand.getBusinessAddr());
		dto.setBusinessAddrDetail(memberCommand.getBusinessAddrDetail());
		dto.setBusinessItem(memberCommand.getBusinessItem());
		dto.setBusinessName(memberCommand.getBusinessName());
		dto.setBusinessPost(memberCommand.getBusinessPost());
		dto.setBusinessRegiNum(memberCommand.getBusinessRegiNum());
		dto.setBusinessTel(memberCommand.getBusinessTel());
		dto.setBusinessType(memberCommand.getBusinessType());
		dto.setMemberId(memberCommand.getMemberId());
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberPw(memberCommand.getMemberPw());
		dto.setPicEmail(memberCommand.getPicEmail());
		dto.setPicName(memberCommand.getPicName());
		dto.setPicPhone(memberCommand.getPicPhone());
		dto.setRepresentativeName(memberCommand.getRepresentativeName());
		
		memberMapper.memberInsert(dto);
	}
}
