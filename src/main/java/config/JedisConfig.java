package config;

import redis.clients.jedis.JedisPoolConfig;


/**
 * @author timwong5
 * @date 2022-07-22 10:58
 */
public class JedisConfig {


    /**
     * 设置JedisPool连接池属性
     * @param config
     */
    public static void setJedisPoolConfig(JedisPoolConfig config) {
        // 最大连接数
        config.setMaxTotal(300);
        // 控制一个pool最多有多少个状态为idle（空闲）的jedis的实例
        config.setMaxIdle(300);
        // 设置的最大的等待时间
        config.setMaxWaitMillis(10000);
        // 在借一个jedis实例时 是否提前进行验证操作，如果为true则得到的jedis实例均是可用的
        config.setTestOnBorrow(true);
    }



}
