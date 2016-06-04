package com.mailworld.weboa.ms.base.fn;

import java.util.Map;
import java.util.function.Function;

import com.auth0.jwt.JWTVerifier;

public class JWTParser extends JWTFunction implements Function<String, Map<String, Object>>{
	
	private JWTVerifier jwtImpl;

	public JWTParser(String secretKey) {
		super(secretKey);
		this.jwtImpl = new JWTVerifier(secretKey);
	}

	public Map<String, Object> apply(String token) {
		try {
			return this.jwtImpl.verify(token);
		} catch (Exception e) {
			return null;
		}
	}

}
