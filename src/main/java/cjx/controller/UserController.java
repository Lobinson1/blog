package cjx.controller;

import cjx.entity.User;
import cjx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/19
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("getUser")
	@ResponseBody
	public void getUser(){
		User user = userService.getUser("aaa");
		System.out.println(user == null ? "" : user);
		System.out.println(user);
	}

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(){
		return "register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(User user, Model model){
		userService.insertUser(user);
		model.addAttribute("user", userService.getUser(user.getUsername()));
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(User user){
		String username = user.getUsername();
		String password = user.getPassword();
		return "index";
	}

	@RequestMapping("checkUsername")
	@ResponseBody
	public String checkUsername(HttpServletRequest request){
		String username = request.getParameter("username");
		if (userService.checkUsername(username)){
			return "fails";
		}else {
			return "success";
		}
	}
}
