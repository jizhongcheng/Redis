package testRedis;

import redis.clients.jedis.Jedis;

public class test {

	public static void main(String[] args) {
//        static String host  = "172.17.50.183";
//        static int port = 6379;
//        static Jedis jedis = null;
//        static{
//            jedis = new Jedis(host,port);
//            jedis.auth("wlxy123");
//        }

		//连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));

	}

}
