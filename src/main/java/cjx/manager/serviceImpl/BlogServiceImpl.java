package cjx.manager.serviceImpl;

import cjx.manager.dao.BlogDao;
import cjx.manager.entity.Blog;
import cjx.manager.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * ${DESCRIBE}
 *
 * @author lobinson
 * @date 2017/11/8
 */
@Service
public class BlogServiceImpl implements BlogService {

	private final BlogDao blogDao;

	@Autowired
	public BlogServiceImpl(BlogDao blogDao) {
		this.blogDao = blogDao;
	}

	@Override
	public Blog get(Integer id) {
		return blogDao.selectByPrimaryKey(id);
	}

	@Override
	public List<Blog> getAll() {
		return blogDao.selectAll();
	}

	@Override
	public int insert(Blog blog) {
		return blogDao.insert(blog);
	}

	@Override
	public int update(Blog blog) {
		return blogDao.updateByPrimaryKey(blog);
	}

	@Override
	public int delete(Integer id) {
		return blogDao.deleteByPrimaryKey(id);
	}

	@Override
	public boolean checkTitle(String title) {
		Example example = new Example(Blog.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("title", title);
		return blogDao.selectCountByExample(example) <= 0;
	}
}
