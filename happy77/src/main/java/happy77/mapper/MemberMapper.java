package happy77.mapper;

import org.apache.ibatis.annotations.Mapper;

import happy77.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public String memberAutoNum();
}
