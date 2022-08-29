package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestPersonApp extends Prog2ApplicationTests {
	@Autowired

	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before

	public void setup() {

		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

	}

	@Test

	public void testPerson() throws Exception {

		mockMvc.perform(get("/person")).andExpect(status().isOk())

				.andExpect(content().contentType("application/json"))

				.andExpect(jsonPath("$.personName").value("Aritra Lahiri"))
				.andExpect(jsonPath("$.passion").value("Creative Thinking"))

				.andExpect(jsonPath("$.personId").value("1"));

	}
}
