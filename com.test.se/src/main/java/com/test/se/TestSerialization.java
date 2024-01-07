package com.test.se;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSerialization {

	public static void main(String[] args) throws JsonProcessingException {
		TestObjects testObjects = new TestObjects();
		testObjects .setEmail("helo@gmail.com");
		testObjects.setPassword("11108487"); 
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(testObjects));

	}

}
