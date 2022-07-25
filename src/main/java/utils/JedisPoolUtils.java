package utils;

/**
 * @author timwong5
 * @date 2022-07-22 9:35
 */
public class JedisPoolUtils {
//    private static JedisPool jedisPool;
//
//    static{
//        Jedis jedis = new Jedis();
//        jedisPool = new JedisPool();
//        jedis.setDataSource(jedisPool);
//        //获取输入流
//        InputStream is = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
//        //创建properties对象
//        Properties properties = new Properties();
//        try {
//            properties.load(is);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //获取数据、设置到JedisPoolConfig中
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxTotal(Integer.parseInt(properties.getProperty("maxTotal")));
//        jedisPoolConfig.setMaxIdle(Integer.parseInt(properties.getProperty("maxIdle")));
//        String host = properties.getProperty("host");
//        Integer port = Integer.parseInt(properties.getProperty("port"));
//        System.out.println(host+","+port);
//        jedisPool = new JedisPool(jedisPoolConfig,host,port);
//    }
//
//    public static Jedis getJedis(){
//        return jedisPool.getResource();
//    }




}
