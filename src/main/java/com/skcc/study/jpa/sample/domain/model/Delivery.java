package com.skcc.study.jpa.sample.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Delivery extends BaseEntity {

	@Id @GeneratedValue
	private Long id;
	
	private String address;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
	@OneToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;
	
	@Builder
	public Delivery(String address, OrderStatus orderStatus, Order order) {
		this.address = address;
	}
}
