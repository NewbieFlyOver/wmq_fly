package firstTest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import firstTest.dto.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	
	

	int updateByPrimaryKey(User record);
    
    List<User> selectByUserPhone(@Param("userPhone") String userPhone);
    
    User selectByPrimaryKey(Integer id);

    int selectByUPassworAndPhone(User user);
    
    int selectByOldPasswordAndAccount(User user);
    
    int updatePasswordByAccount(User user);
    
    int updatePasswordByOldPassword(User user);
    
    int updateByUserId(User record);
}