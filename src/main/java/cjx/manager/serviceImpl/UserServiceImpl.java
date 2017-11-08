package cjx.manager.serviceImpl;

import cjx.manager.dao.UserDao;
import cjx.manager.entity.User;
import cjx.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/19
 */
@Service
public class UserServiceImpl implements UserService {

	private final UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

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
		userDao.insert(user);
	}

	@Override
	public boolean checkLoginInfo(String username, String password) {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		return userDao.selectCount(u) == 1;
	}

	@Override
	public boolean checkUsername(String username) {
		return userDao.isExist(username);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateByPrimaryKey(user);
	}

	@Override
	public User get(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAll() {
		return userDao.selectAll();
	}

	@Override
	public int insert(User user) {
		return userDao.insert(user);
	}

	@Override
	public int update(User user) {
		return userDao.updateByPrimaryKey(user);
	}

	@Override
	public int delete(Integer id) {
		return userDao.deleteByPrimaryKey(id);
	}
}
