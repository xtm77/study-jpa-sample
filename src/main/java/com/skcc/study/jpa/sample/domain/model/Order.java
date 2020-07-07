package com.skcc.study.jpa.sample.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity {

	@Id @GeneratedValue
	private Long id;
	
	@OneToOne(mappedBy = "order")
	private Delivery delivery;
	
	private int orderPrice;
	private int orderCount;
	
}
