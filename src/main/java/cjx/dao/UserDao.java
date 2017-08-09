package cjx.dao;

import cjx.entity.User;
import org.springframework.stereotype.Repository;
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

}
