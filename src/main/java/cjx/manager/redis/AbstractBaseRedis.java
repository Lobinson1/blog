package cjx.manager.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/7/18
 */
public abstract class AbstractBaseRedis {

	private final RedisTemplate redisTemplate;

	@Autowired
	public AbstractBaseRedis(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	protected RedisTemplate getRedisTemplate() {
		return redisTemplate;
	}
}
