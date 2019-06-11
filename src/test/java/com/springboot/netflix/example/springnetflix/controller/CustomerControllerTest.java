package com.springboot.netflix.example.springnetflix.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.springboot.netflix.example.springnetflix.model.Customer;
import com.springboot.netflix.example.springnetflix.service.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {


  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private CustomerService customerService;

  @Before
  public void setUp() throws Exception {
    when(customerService.getCustomerProducts(any(String.class)))
        .thenReturn(Customer.builder().id("1").name("vijay").build());
  }


  @Test
  public void testCustomerController() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/customer/{id}", 1)
        .accept(MediaType.APPLICATION_JSON))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$.name").exists())
        .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());
  }
}