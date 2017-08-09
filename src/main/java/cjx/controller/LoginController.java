package cjx.controller;

import cjx.entity.User;
import cjx.service.UserService;
import cjx.serviceImpl.UserServiceImpl;
import cjx.utils.Digests;
import cjx.utils.Encodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/8/8
 */
@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(){
		return "register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(User user, Model model){
		String password = user.getPassword();
		String encodePwd = Encodes.encodeHex(Digests.sha1(password.getBytes()));
		user.setPassword(encodePwd);
		userService.insertUser(user);
		model.addAttribute("user", userService.getUser(user.getUsername()));
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(User user, Model model){
		String username = user.getUsername();
		String password = user.getPassword();
		String encodePwd = Encodes.encodeHex(Digests.sha1(password.getBytes()));
		if (userService.checkLoginInfo(username, encodePwd)){
			return "index";
		}else {
			model.addAttribute("errorMsg", "123123");
			return "error/loginError";
		}
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
