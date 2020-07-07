package com.skcc.study.jpa.sample.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Team extends BaseEntity {

	@Id @GeneratedValue
	private Long id;
	private String name;
	
}
