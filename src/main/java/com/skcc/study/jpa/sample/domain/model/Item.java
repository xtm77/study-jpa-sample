package com.skcc.study.jpa.sample.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Item extends BaseEntity {

	@Id @GeneratedValue
	@Column(name = "ITEM_ID")
	private Long id;
	
	@ManyToMany(mappedBy = "items")
	private List<Category> categories = new ArrayList<>();
	
	private String name;
	private int price;
	
	@Builder
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
