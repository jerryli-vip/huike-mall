package com.kkb.seckill.redis;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

/**
 * redicache 工具类
 * 
 */
@SuppressWarnings("unchecked")
@Component
public class RedisUtil {
	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;

	
	/**
	 * 减库
	 */
//	public Integer deceby (String key){
//		redisTemplate.
//	}
	 /**
     *  自增不存在数值会默认初始化0然后加1，传入时间后自动销毁
     * @param key
     * @param liveTime
     */
    public Long incrby(final String key,final long liveTime) {
    	return (Long) redisTemplate.execute(new RedisCallback<Object>() {
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                Long incr = connection.incr(key.getBytes());
                connection.expire(key.getBytes(), liveTime);
                return incr;
            }
        });
    }
    public Long incrby(final String key) {
    	return (Long) redisTemplate.execute(new RedisCallback<Object>() {
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                Long incr = connection.incr(key.getBytes());
                return incr;
            }
        });
    }
    /**
     * 自减
     * @param key
     */
    @SuppressWarnings({ "rawtypes"})
    public Long decrby(final String key) {
    	return (Long) redisTemplate.execute(new RedisCallback() {
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                Long incr = connection.decr(key.getBytes());
                return incr;
            }
        });
    }
    
	/**
	 * 批量删除对应的value
	 * 
	 * @param keys
	 */
	public void remove(final String... keys) {
		for (String key : keys) {
			remove(key);
		}
	}

	/**
	 * 批量删除key
	 * 
	 * @param pattern
	 */
	public void removePattern(final String pattern) {
		Set<Serializable> keys = redisTemplate.keys(pattern);
		if (keys.size() > 0)
			redisTemplate.delete(keys);
	}

	/**
	 * 删除对应的value
	 * 
	 * @param key
	 */
	public void remove(final String key) {
		if (exists(key)) {
			redisTemplate.delete(key);
		}
	}

	/**
	 * 判断缓存中是否有对应的value
	 * 
	 * @param key
	 * @return
	 */
	public boolean exists(final String key) {
		return redisTemplate.hasKey(key);
	}

	/**
	 * 读取缓存
	 * 
	 * @param key
	 * @return
	 */
	public String get(final String key) {
		Object result = null;
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
		result = operations.get(key);
		if (result == null) {
			return null;
		}
		return result.toString();
	}

	/**
	 * 写入缓存
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean set(final String key, Object value) {
		boolean result = false;
		try {
			ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
			operations.set(key, value);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	 /**
     * 存储对象
     */
    public <T> Boolean set(KeyPrefix prefix, String key, T value) {
    	ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            String str = beanToString(value);
            if (str == null || str.length() <= 0) {
                return false;
            }
            String realKey = prefix.getPrefix() + key;
            int seconds = prefix.expireSeconds();//获取过期时间
            if (seconds <= 0) {
            	operations.set(realKey, str);
            } else {
            	operations.set(realKey, str,seconds);
            }
        return true;
    }
    
    public static <T> String beanToString(T value) {
        if (value == null) {
            return null;
        }
        Class<?> clazz = value.getClass();
        if (clazz == int.class || clazz == Integer.class) {
            return String.valueOf(value);
        } else if (clazz == long.class || clazz == Long.class) {
            return String.valueOf(value);
        } else if (clazz == String.class) {
            return (String) value;
        } else {
            return JSON.toJSONString(value);
        }

    }
    
	/**
	 * 写入缓存
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean set(final String key, Object value, Long expireTime) {
		boolean result = false;
		try {
			ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
			operations.set(key, value);
			redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean hmset(String key, Map<String, String> value) {
		boolean result = false;
		try {
			redisTemplate.opsForHash().putAll(key, value);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, String> hmget(String key) {
		Map<String, String> result = null;
		try {
			result = redisTemplate.opsForHash().entries(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}