package happy77.mapper;

import org.apache.ibatis.annotations.Mapper;

import happy77.domain.MemberDTO;

@Mapper
public interface MemberMyMapper {
	public MemberDTO memberInfo(String memberId);
}
