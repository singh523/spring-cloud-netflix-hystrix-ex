package com.springboot.netflix.example.springnetflix.service;

import com.springboot.netflix.example.springnetflix.client.ProductsClient;
import com.springboot.netflix.example.springnetflix.model.Customer;
import com.springboot.netflix.example.springnetflix.model.Products;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private ProductsClient productsClient;

  @Override
  public Customer getCustomerProducts(String id) {

    log.info("Customer details for {}", id);

    Products products = productsClient.getProducts(id);

    return Customer.builder().id(id).emailId("test@test.com").name("vijay").products(products)
        .build();
  }
}
