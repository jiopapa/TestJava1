package happy77.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import happy77.command.MemberCommand;
import happy77.mapper.MemberMapper;

@Service
public class MemberAutoNumService {
	@Autowired
	MemberMapper memberMapper;
	
	public void execute(Model model) {
		String memberNum = memberMapper.memberAutoNum();
		MemberCommand dto = new MemberCommand();
		dto.setMemberNum(memberNum);
		model.addAttribute("memberCommand", dto);
	}
}
