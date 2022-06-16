package com.pichincha.prueba.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {


  private Long orderDetailId;

  private Integer totalOdered;
  private Double priceUnit;
  private Double priceTotal;

  private ProductDto product;

  private OrderHeaderDto orderHeader;
}
