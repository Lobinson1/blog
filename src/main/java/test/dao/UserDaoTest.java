package test.dao;

import cjx.dao.UserDao;
import cjx.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseJunit4Test;
import tk.mybatis.mapper.entity.Example;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/18
 */
public class UserDaoTest extends BaseJunit4Test {

	@Autowired
	private UserDao userDao;

	@Test
	public void getUserTest() throws IOException, SQLException {
		User u = userDao.getUser("aaa");
		System.out.println(u);
	}

	@Test
	public void testBase() {
		List<User> u = userDao.selectAll();
		Example example = new Example(User.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("username", "aaa");
		List<User> a = userDao.selectByExample(example);
		User aaa = new User();
		aaa.setId(1);
		aaa.setUsername("aaa");
		User aa = userDao.selectOne(aaa);
		System.out.println(u);
		System.out.println(a);
		System.out.println(aa);
	}
}
