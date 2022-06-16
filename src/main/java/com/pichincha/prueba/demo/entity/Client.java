package com.pichincha.prueba.demo.entity;

import java.util.Date;
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
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long clientId;
	private String userName;
	private Date createdDate;

	@OneToMany(mappedBy = "client" , fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
	private List<OrderHeader> orderHeaders;
	
}


