package happy77.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Alias("member")
public class MemberDTO {
	String memberNum;
	String memberId;
	String memberPw;
	String picName;
	String picPhone;
	String picEmail;
	String businessRegiNum;
	String businessName;
	String businessAddr;
	String businessAddrDetail;
	String businessPost;
	String representativeName;
	String businessType;
	String businessItem;
	String businessTel;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberRegist;
	
}
