package com.beyang.cn;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

public class TestJedis {
	/**
	 *  普通方式
	 */
	public static void main(String[] args){
		String host = "127.0.0.1";
		int port = 6379;
		
		JedisShardInfo shardInfo = new JedisShardInfo(host, port);
		shardInfo.setPassword("wxhl");
		Jedis jedis = new Jedis(shardInfo);
		String name = jedis.get("name");
		System.out.println("name:" + name);
	}
}
