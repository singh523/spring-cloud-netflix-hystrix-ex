package com.springboot.netflix.example.springnetflix.client;

import com.springboot.netflix.example.springnetflix.model.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "productsClient", url = "http://localhost:8090/")
public interface ProductsClient {

  @RequestMapping(value = "/products/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  Products getProducts(@PathVariable("id") String id);

}
