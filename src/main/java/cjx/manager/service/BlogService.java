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
public interface BlogService extends BaseService<Blog> {

	boolean checkTitle(String title);

}
