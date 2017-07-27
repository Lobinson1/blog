package test.dao;

import cjx.dao.UserDao;
import cjx.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseJunit4Test;

import java.io.IOException;
import java.sql.SQLException;

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
}
