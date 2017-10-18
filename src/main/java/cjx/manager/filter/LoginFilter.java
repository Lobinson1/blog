package cjx.manager.filter;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/10/16
 */
public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {


	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		HttpSession session = httpServletRequest.getSession();

		if ("/manager/login".equals(httpServletRequest.getServletPath())){
			chain.doFilter(request, response);
			return;
		}
		if ("/manager/login/login".equals(httpServletRequest.getServletPath())){
			chain.doFilter(request, response);
			return;
		}

		Integer userId = (Integer) session.getAttribute("cjx_user_id");
		if (userId != null){
			chain.doFilter(request, response);
		}else {
			String path = httpServletRequest.getServletPath();
			if (StringUtils.isNotBlank(path) && path.startsWith("/")){
				path = path.substring(1, path.length());
			}
			httpServletResponse.sendRedirect("/blog/manager/login?server=" + path);
		}
	}

	@Override
	public void destroy() {

	}
}
