package happy77.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import happy77.domain.EstimateInquiryDTO;

@Mapper
public interface EstimateInquiryMapper {
	public int inquiryInsert(EstimateInquiryDTO dto);
	public List<EstimateInquiryDTO> inquiryList(String memberNum);
	public EstimateInquiryDTO selectOne(String estimateInquiryNum);
}
