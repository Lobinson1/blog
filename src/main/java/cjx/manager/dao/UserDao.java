package cjx.manager.dao;

import cjx.manager.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/18
 */
@Repository
public interface UserDao extends Mapper<User> {

	User getUser(String username);

	int countUser();

	boolean isExist(String username);

}
