package happy77.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Alias("estimateinquiry")
@NoArgsConstructor
@AllArgsConstructor
public class EstimateInquiryDTO {
	String estimateInquiryNum;
	String estimateInquiryName;
	String material;
	String materialThickness;
	String metalSize;
	Integer metalworkQty;
	
	String desiredDrawing;
	String desiredDrawingImg;
	
	String estimateInquiryContent;
	Date desiredDeliveryDate;
	Date estimateInquiryRegist;
	String memberNum;
}
