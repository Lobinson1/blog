package test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/19
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"}) //加载配置文件
public class BaseJunit4Test {
}
