package com.pichincha.prueba.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String name;
	
	@OneToMany(mappedBy="product", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	List<StoreStock> storeStocks;
	
	@OneToMany(mappedBy="product", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	List<OrderDetail> OrderDetails;
	

}
