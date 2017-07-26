package cjx.serviceImpl;

import cjx.dao.UserDao;
import cjx.entity.User;
import cjx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/19
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(String username) {
		return userDao.getUser(username);
	}

//	@Override
//	public int count() {
//		return userDao.abc();
//	}

//	@Override
//	public void insertUser(User user) {
//		userDao.insertUser(user);
//	}

//	@Override
//	public void updateUser(User user) {
//		userDao.updateUser(user);
//	}
}
