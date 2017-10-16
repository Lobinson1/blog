package cjx.manager.service;

import cjx.manager.entity.Blog;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/10/16
 */
public interface BlogService {

	Blog get(Integer id);

	int insert(Blog blog);

	int update(Blog blog);

	int delete(Integer id);

	boolean checkTitle(String title);

}
