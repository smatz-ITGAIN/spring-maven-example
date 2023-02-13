package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	public void newUserTest() {
		User user = new User();
		user.setName("Peter");
		user.setAdmin(false);
		assertTrue(user.getName().equals("Peter"));
		assertTrue(!user.isAdmin());
	}
}