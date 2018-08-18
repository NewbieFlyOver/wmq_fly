package firstTest.service.serviceImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import firstTest.dto.User;
import firstTest.mapper.UserMapper;
import firstTest.service.UserService;


@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public Object selectUserById(User user) {
		return userMapper.selectByPrimaryKey(user.getId());
	}
	
}
