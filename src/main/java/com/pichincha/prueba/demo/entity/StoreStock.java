package com.pichincha.prueba.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreStock {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long StoreStockId;

  private Integer stock;
  private Double soldPrice;

  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name= "storeId", nullable = false)
  private Store store;

  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name= "productId", nullable = false)
  private Product product;
}
