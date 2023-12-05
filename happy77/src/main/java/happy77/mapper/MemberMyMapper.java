package happy77.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import happy77.domain.EstimateInquiryDTO;
import happy77.domain.MemberDTO;

@Mapper
public interface MemberMyMapper {
	public MemberDTO memberInfo(String memberId);
	public List<EstimateInquiryDTO> myInquiryList(String memberNum);
}
