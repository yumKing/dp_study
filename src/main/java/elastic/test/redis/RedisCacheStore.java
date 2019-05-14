package elastic.test.redis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;

/**
 * Redis操作客户端接口
 */

@Repository
public class RedisCacheStore {
	@Autowired
	protected RedisTemplate<?, ?> redisTemplate;

	public void hAdd(final String key, final Object hashKey, final Object hashValue) {
		if (hashValue == null) {
			return;
		}

		redisTemplate.execute(new RedisCallback() {
			@Override
			public Integer doInRedis(RedisConnection connection) throws DataAccessException {
				connection.hSet(key.getBytes(), hashKey.toString().getBytes(), hashValue.toString().getBytes());
				return 1;
			}
		});
	}
}
