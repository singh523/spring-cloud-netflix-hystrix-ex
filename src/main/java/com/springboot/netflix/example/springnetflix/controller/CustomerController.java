package com.springboot.netflix.example.springnetflix.controller;

import com.springboot.netflix.example.springnetflix.model.Customer;
import com.springboot.netflix.example.springnetflix.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @RequestMapping("/customer/{id}")
  public Customer getCustomer(@PathVariable String id){
    return customerService.getCustomerProducts(id);
 }
}
