package cjx.daoImpl;

import cjx.redis.AbstractBaseRedis;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/18
 */
public abstract class BaseRedisDao extends AbstractBaseRedis {

	private ValueOperations valueOperations = getRedisTemplate().opsForValue();

	public BaseRedisDao(RedisTemplate redisTemplate) {
		super(redisTemplate);
	}

	public void insert(String k, Object v){
		valueOperations.set(k, v);
	}

	public void update(String k, Object v){
		valueOperations.set(k, v);
	}
}
