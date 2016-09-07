package wjw.redis;

import redis.clients.jedis.Jedis;

public class Redis4Java {
	public static void main(String[] args) {
		 //连接本地的 Redis 服务
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      // AUTH "passw0rd"
	      jedis.auth("passw0rd");
	      //查看服务是否运行
	      System.out.println("Server is running: "+jedis.ping());
	      
	      jedis.set("javakey", "hello redis 4 java");
	      System.out.println(jedis.get("javakey"));
	      System.out.println(jedis.keys("*"));
	      System.out.println(jedis.lrange("mylist", 0, 10));
	      System.out.println(jedis.save());
	}
}
