package cjx.manager.controller;

import cjx.manager.entity.User;
import cjx.manager.serviceImpl.UserServiceImpl;
import cjx.manager.utils.Digests;
import cjx.manager.utils.Encodes;
import cjx.manager.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录逻辑控制
 *
 * @author chenjunxu
 * @date 2017/8/8
 */
@Controller
@RequestMapping("manager/login")
public class LoginController{

	@Autowired
	private UserServiceImpl userService;

	private ResultUtils result;

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(){
		return "manager/login/register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(User user, Model model){
		String password = user.getPassword();
		String encodePwd = Encodes.encodeHex(Digests.sha1(password.getBytes()));
		user.setPassword(encodePwd);
		userService.insertUser(user);
		model.addAttribute("user", userService.getUser(user.getUsername()));
		return "manager/login/login";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String login(){
		return "manager/login/login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String login(User user, Model model, HttpServletRequest request){
		String username = user.getUsername();
		String password = user.getPassword();
		String encodePwd = Encodes.encodeHex(Digests.sha1(password.getBytes()));
		if (userService.checkLoginInfo(username, encodePwd)){
			User u = userService.getUser(username);
			HttpSession session = request.getSession();
			session.setAttribute("cjx_user_id", u.getId());
			return "manager/index";
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
			return result.Error("用户名已存在");
		}else {
			return result.Success("用户名可用");
		}
	}
}
