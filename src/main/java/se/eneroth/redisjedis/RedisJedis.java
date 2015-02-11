package se.eneroth.redisjedis;

import redis.clients.jedis.Jedis;

public class RedisJedis {

	public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);
        jedis.del("foo");
        System.out.println(jedis.keys("*"));
        jedis.set("foo2", "bar2");
        String value2 = jedis.get("foo2");
        System.out.println(value2);
        jedis.del("foo2");
    }
}