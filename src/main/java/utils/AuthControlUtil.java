package utils;


import config.JedisConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

/**
 * @author timwong5
 * @date 2022-07-21 17:20
 */
public class AuthControlUtil {

    static Jedis jedis = getJedis();

    /**
     * 通过连接池连接到Redis
     */
    public static Jedis getJedis(){
        Jedis jedis = new Jedis();
        //配置jedis连接池
        JedisPoolConfig config = new JedisPoolConfig();
        //设置JedisPool
        JedisConfig.setJedisPoolConfig(config);
        JedisPool jedisPool = new JedisPool(config, "172.18.118.18", 6379,
                10000, "",0);
        jedis.setDataSource(jedisPool);
        return jedis;
    }

    /**
     * 关闭Redis
     * @param jedis
     */
    public static void closeResource(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }

    public static Set<String> getAllKeys(){
        Set<String> keys = jedis.keys("*");
        if (keys.isEmpty()){
            throw new RuntimeException("redis中数据为空");
        }
        else return keys;
    }

    public void checkAdminAuthorize(String userId){
        if (!checkIfSpecialUser(userId)){
            Set<String> allKeys = getAllKeys();
        }
    }

    /**
     * 检查 此用户是否为特殊用户
     * @param userId
     * @return
     */
    public boolean checkIfSpecialUser(String userId){
        Set<String> allKeys = getAllKeys();
        return allKeys.contains(userId);
    }




}
