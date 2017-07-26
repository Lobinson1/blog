package cjx.service;

import cjx.entity.User;

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

//	void updateUser(User user);

}
