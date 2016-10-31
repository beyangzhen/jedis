package com.beyang.cn;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestJedisPool {
	/*
	 * 连接池的方式，操作redis服务的数据
	 * */
	public static void main(String[] args){
		String host = "127.0.0.1";
		int port = 6379;
		int timeout = 10000;
		String password = "wxhl";
		
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		JedisPool jedisPool = new JedisPool(poolConfig, host, port, timeout, password);
		Jedis jedis = jedisPool.getResource();
		String name = jedis.get("name");
		System.out.println("name:" + name);
	}
}
