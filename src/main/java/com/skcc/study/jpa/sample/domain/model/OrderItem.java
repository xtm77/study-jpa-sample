package com.skcc.study.jpa.sample.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class OrderItem extends BaseEntity {

	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "ITEM_ID")
	private Item item;
	
	private int price;
	private int count;
	
	@Builder
	public OrderItem(Order order, Item item, int price, int count) {
		this.order = order;
		this.item = item;
		this.price = price;
		this.count = count;
	}
}
