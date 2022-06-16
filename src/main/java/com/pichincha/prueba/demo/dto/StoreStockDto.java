package com.pichincha.prueba.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreStockDto {

  private Long StoreStockId;

  private Integer stock;
  private Double soldPrice;

  private StoreDto store;
  private ProductDto product;
}
