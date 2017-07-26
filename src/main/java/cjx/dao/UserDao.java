package cjx.dao;

import cjx.entity.User;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/18
 */
public interface UserDao {

	User getUser(String username);

	int countUser();

	void insertUser(User user);

//	void updateUser(User user);

}
