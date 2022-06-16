package com.pichincha.prueba.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderHeaderDto {

  private Long orderHeaderId;
  private Date dateOrdered;
  
  private ClientDto client;
  private StoreDto store;
  


}
