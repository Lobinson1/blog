package cjx.serviceImpl;

import cjx.dao.UserDao;
import cjx.entity.User;
import cjx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/19
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User getUser(String username) {
		return userDao.getUser(username);
	}

	@Override
	public int countUser() {
		return userDao.countUser();
	}

	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public boolean checkUsername(String username) {
		return userDao.isExist(username);
	}
	//	@Override
//	public void updateUser(User user) {
//		userDao.updateUser(user);
//	}
}
