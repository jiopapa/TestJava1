package happy77.service.estimateInquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import happy77.command.EstimateInquiryCommand;
import happy77.command.MemberCommand;
import happy77.domain.EstimateInquiryDTO;
import happy77.domain.MemberDTO;
import happy77.mapper.EstimateInquiryMapper;

@Service
public class InquiryDetailService {
	@Autowired
	EstimateInquiryMapper estimateInquiryMapper;
	public void execute(String estimateInquiryNum, Model model) {
		
		
		EstimateInquiryDTO dto = estimateInquiryMapper.selectOne(estimateInquiryNum);
		EstimateInquiryCommand estimateInquiryCommand = new EstimateInquiryCommand();
		estimateInquiryCommand.setDesiredDeliveryDate(dto.getDesiredDeliveryDate());

		estimateInquiryCommand.setEstimateInquiryContent(dto.getEstimateInquiryContent());
		estimateInquiryCommand.setEstimateInquiryName(dto.getEstimateInquiryName());
		estimateInquiryCommand.setEstimateInquiryNum(dto.getEstimateInquiryNum());
		estimateInquiryCommand.setEstimateInquiryRegist(dto.getEstimateInquiryRegist());
		estimateInquiryCommand.setMaterial(dto.getMaterial());
		estimateInquiryCommand.setMaterialThickness(dto.getMaterialThickness());
		estimateInquiryCommand.setMemberNum(dto.getMemberNum());
		estimateInquiryCommand.setMetalSize(dto.getMetalSize());
		estimateInquiryCommand.setMetalworkQty(dto.getMetalworkQty());
	
		model.addAttribute("estimateInquiryCommand", estimateInquiryCommand);
	}
}
