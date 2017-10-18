package cjx.manager.controller;

import cjx.manager.utils.ResultUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/10/16
 */
@Controller
@RequestMapping("manager/index")
public class IndexController {

	private ResultUtils result;

	@RequestMapping
	public String index(){
		return "manager/index";
	}

	@RequestMapping("index")
	public String managerIndex() {
		return "manager/index/index";
	}

	@RequestMapping("navCode")
	public String navCode(HttpServletRequest request){
		String code = request.getParameter("code");
		if (StringUtils.isNotBlank(code)){
			switch (code){
				case "blog":
					return "manager/blog/list";
				case "user":
					return "manager/user/list";
				default:
					return "manager/index/index";
			}
		}
		return result.Error("编码不能为空");

	}
}
