package com.mailworld.weboa.ms.base.fn;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JWTFunctionTest {

	private String key = "abc123";
	
	@Test
	public void test_build() {
		
		JWTBuilder builder = new JWTBuilder(key);
		
		Map<String, Object> claims = new HashMap();
		claims.put("username", "Hello");
		claims.put("id", "666");
		
		String token = builder.apply(claims);
		
		assertNotNull(token);
		
		System.out.println(token);
		
		JWTParser parser = new JWTParser(key);
		claims = parser.apply(token);
		
		assertNotNull(claims);
		assertEquals("username", "Hello", claims.get("username"));
		assertEquals("id", "666", claims.get("id"));
		
		claims.entrySet().forEach( entry -> System.out.println(entry.getKey() + ":" + entry.getValue()) );
	}

}
