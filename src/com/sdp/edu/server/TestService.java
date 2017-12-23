package com.sdp.edu.server;

import javax.jws.WebService;

@WebService
public class TestService implements TestServiceInf {

	@Override
	public String test(String string) {
		System.err.println(string);
		return string;
	}

}
