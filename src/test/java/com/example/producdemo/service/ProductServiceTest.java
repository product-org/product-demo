package com.example.producdemo.service;

import com.example.producdemo.domain.Product;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ProductServiceTest<product> {

    @Mock
    private ProductService productService;

    private List<Product> products = new ArrayList<Product>();

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Product product = new Product();
        product.setName("test");
        products.add(product);


    }

    @Test
    public void testSaveProduct() {
        doNothing().when(productService).saveProduct("test");
        productService.saveProduct("test");

        verify(productService, times(1)).saveProduct("test");
    }

    @Test
    public void testFindByName() {
        Mockito.when(productService.findByName(anyString())).thenReturn(products);
        List<Product> products = productService.findByName("test");
        assertNotNull(products);
        assertFalse(products.isEmpty());
        assertEquals(1, products.size());
        assertEquals("test", products.get(0).getName());
    }
}