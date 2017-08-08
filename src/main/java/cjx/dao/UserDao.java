package cjx.dao;

import cjx.entity.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/18
 */
public interface UserDao extends Mapper<User> {

	User getUser(String username);

	int countUser();

	boolean isExist(String username);

//	void insertUser(User user);

//	void updateUser(User user);

}
