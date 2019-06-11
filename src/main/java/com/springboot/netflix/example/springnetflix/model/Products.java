package com.springboot.netflix.example.springnetflix.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Products {

  private String id;

  private String name;

  private String code;

  private String price;

}
