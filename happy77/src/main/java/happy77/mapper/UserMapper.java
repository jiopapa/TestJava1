package happy77.mapper;

import org.apache.ibatis.annotations.Mapper;

import happy77.domain.AuthInfoDTO;

@Mapper
public interface UserMapper {
	public AuthInfoDTO loginSelect(String userId);

}
