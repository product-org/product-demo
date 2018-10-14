package com.example.producdemo.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProductTest {
	
	private Product product;
	@Before
	public void setUP()
	{
		product = new Product();
	}

	@Test
	public void testGetId() {
		product.setId(1L);
		assertNotNull(product.getId());
		assertEquals(1L, product.getId().longValue());
	}

	@Test
	public void testSetId() {
		product.setId(2L);
		assertNotNull(product.getId());
		assertEquals(2L, product.getId().longValue());
		
	}

	@Test
	public void testGetName() {
		product.setName("Shah");
		assertNotNull(product.getName());
		assertEquals("Shah", product.getName());
		
		
	}

	@Test
	public void testSetName() {
		product.setName("Shah");
		assertNotNull(product.getName());
		assertEquals("Shah", product.getName());
	}

}
