package test;

import cjx.dao.UserDao;
import cjx.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/18
 */
public class UserDaoTest extends BaseJunit4Test{

	@Autowired
	private UserDao userDao;

	@Test
	public void getUserTest() throws IOException, SQLException {

		User a = userDao.getUser("aaa");
		System.out.println(a);
	}
}
