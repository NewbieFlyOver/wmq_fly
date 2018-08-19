package firstTest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import firstTest.dto.User;
import firstTest.service.UserService;


//@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/test/selectUserById", produces="application/json; charset=utf-8")
	@ResponseBody
	public Object selectUserById(@RequestBody User user) {
		return userService.selectUserById(user);
	}

}
