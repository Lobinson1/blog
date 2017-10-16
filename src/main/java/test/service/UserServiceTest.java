package test.service;

import cjx.manager.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseJunit4Test;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/26
 */
public class UserServiceTest extends BaseJunit4Test {

	@Autowired
	private UserService userService;

	@Test
	public void countUser(){
		int count = userService.countUser();
		System.out.println(count);
	}
}
