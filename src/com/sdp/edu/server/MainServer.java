package com.sdp.edu.server;

import javax.xml.ws.Endpoint;

public class MainServer {
	public static void main(String[] args) {
		TestServiceInf serviceInf = new TestService();
		Endpoint.publish("http://192.168.19.73:1234/ws", serviceInf);
	}
}
