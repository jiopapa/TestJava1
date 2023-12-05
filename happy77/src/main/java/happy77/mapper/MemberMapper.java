package happy77.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import happy77.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public String memberAutoNum();
	public String getMemberNum(String memberId);
	public List<MemberDTO> selectAll();
	public MemberDTO selectOne(String memberNum);
	
}
