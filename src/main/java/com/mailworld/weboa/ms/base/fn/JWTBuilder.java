package com.mailworld.weboa.ms.base.fn;

import java.util.Map;
import java.util.function.Function;

import com.auth0.jwt.JWTSigner;

public class JWTBuilder extends JWTFunction implements Function<Map<String, Object>, String>{
	
	
	private JWTSigner jwtImpl;

	public JWTBuilder(String secretKey) {
		super(secretKey);
		this.jwtImpl = new JWTSigner(secretKey);
	}

	public String apply(Map<String, Object> claims) {
		return this.jwtImpl.sign(claims);
	}

}
