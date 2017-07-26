package cjx.controller;

import cjx.entity.User;
import cjx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/19
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("getUser")
	@ResponseBody
	public void getUser(){
//		User u = new User();
//		u.setUsername("aaa");
//		u.setPassword("bbb");
//		userService.insertUser(u);
//		System.out.println(userService.count());
		User user = userService.getUser("aaa");
		System.out.println(user == null ? "" : user);
//		user.setPassword("ccc");
//		userService.updateUser(user);
		System.out.println(userService.getUser("aaa"));
	}
}
