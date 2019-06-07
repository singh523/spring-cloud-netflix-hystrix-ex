package com.springboot.netflix.example.springnetflix.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

  private String id;

  private String name;

  private String emailId;


}
