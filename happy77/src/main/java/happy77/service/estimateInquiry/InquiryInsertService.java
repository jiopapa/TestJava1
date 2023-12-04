package happy77.service.estimateInquiry;

import java.io.File;
import java.net.URL;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import happy77.command.EstimateInquiryCommand;
import happy77.domain.EstimateInquiryDTO;
import happy77.mapper.EstimateInquiryMapper;
import jakarta.servlet.http.HttpSession;

@Service
public class InquiryInsertService {
	@Autowired
	EstimateInquiryMapper estimateInquiryMapper;

	public void execute(EstimateInquiryCommand estimateInquiryCommand, HttpSession session) {
		
		EstimateInquiryDTO dto = new EstimateInquiryDTO();
		dto.setEstimateInquiryName(estimateInquiryCommand.getEstimateInquiryName());
		dto.setDesiredDeliveryDate(estimateInquiryCommand.getDesiredDeliveryDate());
		dto.setEstimateInquiryContent(estimateInquiryCommand.getEstimateInquiryContent());
		dto.setMaterial(estimateInquiryCommand.getMaterial());
		dto.setMaterialThickness(estimateInquiryCommand.getMaterialThickness());
		dto.setMemberNum(estimateInquiryCommand.getMemberNum());
		dto.setMetalSize(estimateInquiryCommand.getMetalSize());
		dto.setMetalworkQty(estimateInquiryCommand.getMetalworkQty());
		/// 파일정보

		// 파일업로드 경로
		URL resource = getClass().getClassLoader().getResource("static/upload");
		String fileDir = resource.getFile();// springBootMVCShopping/bin/main/
		System.out.println(fileDir);

		// 대문 이미지 파일 업로드
		if (!estimateInquiryCommand.getDesiredDrawing()[0].getOriginalFilename().isEmpty()) {
			String originalTotal = "";
			String storeTotal = "";
			for (MultipartFile mtf : estimateInquiryCommand.getDesiredDrawing()) {
				String originalFile = mtf.getOriginalFilename();
				String extension = originalFile.substring(originalFile.lastIndexOf("."));
				String storeName = UUID.randomUUID().toString().replace("-", "");
				String storeFileName = storeName + extension;
				File file = new File(fileDir + "/" + storeFileName); // springBootMVCShopping/bin/main / 1293712984f
				try {
					mtf.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				originalTotal += originalFile + "-";
				storeTotal += storeFileName + "-";
			}
			dto.setDesiredDrawing(storeTotal);
			dto.setDesiredDrawingImg(originalTotal);
		}
		estimateInquiryMapper.inquiryInsert(dto);
	}

}
