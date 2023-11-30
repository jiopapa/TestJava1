package happy77.command;

import java.util.Date;

import lombok.Data;

@Data
public class MemberCommand {
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
	Date memberRegist;
}