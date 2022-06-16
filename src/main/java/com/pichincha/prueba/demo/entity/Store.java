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
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long storeId;
	private String name;
	private String category;
	private String ouner;

	@OneToMany(mappedBy="store", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	List<StoreStock> storeStock;

	
}