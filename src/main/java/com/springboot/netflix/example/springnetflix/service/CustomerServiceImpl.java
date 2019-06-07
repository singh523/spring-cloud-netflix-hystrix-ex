package com.springboot.netflix.example.springnetflix.service;

import com.springboot.netflix.example.springnetflix.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public Customer getCustomerProducts(String id) {
    return Customer.builder().id(id).emailId("test@test.com").name("vijay").build();
  }
}
