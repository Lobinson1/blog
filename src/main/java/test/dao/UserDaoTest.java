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
import java.util.Random;

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
		System.out.println(userDao.countUser());
	}

	@Test
	public void testtest(){
		Random rm = new Random();

		// 获得随机数
		double pross = (1 + rm.nextDouble()) * Math.pow(10, 8);

		// 将获得的获得随机数转化为字符串
		String fixLenthString = String.valueOf(pross);
		String aa = fixLenthString.substring(2, 8 + 2);

		// 返回固定的长度的随机数
		System.out.println(aa);
	}
}
