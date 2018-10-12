package com.sample.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(value = HomeController.class, secure = false)
public class HomeControllerTest {
	
	@Autowired 
	private MockMvc mockMvc;
	
	@Test
	public void testHello() throws Exception {
		mockMvc.perform(get("/sample/hello/{name}", "Sun"))
				.andExpect(status().is2xxSuccessful());
	}

}
