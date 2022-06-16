package com.pichincha.prueba.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderHeader {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Long orderHeaderId;
  private Date dateOrdered;
  
  @ManyToOne(  fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "clientId", nullable = true)
  private Client client;

  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name = "storeId", nullable = false)
  private Store store;

  @OneToMany( mappedBy="orderHeader", fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
  private List<OrderDetail> orderDetails;

}
