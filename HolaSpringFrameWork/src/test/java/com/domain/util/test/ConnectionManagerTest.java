package com.domain.util.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.util.ConnectionManager;

public class ConnectionManagerTest {

	@Before
	public void antes() throws Exception {
	}

	@After
	public void despues() throws Exception {
	}

	@Test
	public void testConnect() {
		try {
			ConnectionManager.connect();
			assertTrue(true);
		} catch (ClassNotFoundException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDisconnect() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetConnection() {
		fail("Not yet implemented");
	}
	
	
	

}
