package com.tcs.rest.resources;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@WebMvcTest(productResource.class)
class ProductResourceTest {

	
	@MockBean
	ProductService service;
	
	@Autowired
	MockMvc mockMvc;  //dummy
	
	@Test
	public void test_addProduct() throws Exception {
		Product product = new Product(1,"Apple Iphone 15",125000);
		when(service.save(product)).thenReturn(product);
		
		mockMvc.perform(post("/addProduct").
				contentType(MediaType.APPLICATION_JSON).
				content(
						new ObjectMapper().
						writeValueAsString(product)
						));
		
	}

}
