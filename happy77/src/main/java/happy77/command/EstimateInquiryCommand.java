package happy77.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EstimateInquiryCommand {
	String estimateInquiryNum;
	String estimateInquiryName;
	String material;
	String materialThickness;
	String metalSize;
	Integer metalworkQty;
	
	
	MultipartFile desiredDrawing[];
	String estimateInquiryContent;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date desiredDeliveryDate;
	Date estimateInquiryRegist;
	String memberNum;
}
