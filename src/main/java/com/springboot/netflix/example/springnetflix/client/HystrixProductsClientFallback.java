package com.springboot.netflix.example.springnetflix.client;

import com.springboot.netflix.example.springnetflix.model.Products;
import org.springframework.stereotype.Component;

@Component
public class HystrixProductsClientFallback implements ProductsClient {

  @Override
  public Products getProducts(String id) {
    return Products.builder().id(id).code("default").name("defaultProduct").build();
  }
}
