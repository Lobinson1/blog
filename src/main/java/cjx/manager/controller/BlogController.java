package cjx.manager.controller;

import cjx.manager.entity.Blog;
import cjx.manager.service.BlogService;
import cjx.manager.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/10/16
 */
@Controller
@RequestMapping("manager/blog")
public class BlogController {

	private final BlogService blogService;
	private ResultUtils result;

	@Autowired
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String blog(){
		return "manager/blog/list";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insert(Model model){
		return "manager/blog/insert";
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(HttpServletRequest request, Blog blog){
		int count = blogService.insert(blog);
		if (count <= 0){
			return result.Error("创建新博失败");
		}
		return result.Success("创建成功");
	}
}
