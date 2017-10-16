package cjx.manager.service;

import cjx.manager.entity.User;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/19
 */
public interface UserService {

	User getUser(String username);

	int countUser();

	boolean checkUsername(String username);

	void insertUser(User user);

	boolean checkLoginInfo(String username, String password);

	void updateUser(User user);

}
