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
public class Member extends BaseEntity {
	
	@Id @GeneratedValue
	private Long id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "TEAM_ID")
	private Team team;
	
	@Builder
	public Member(String name, Team team) {
		this.name = name;
		this.team = team;
	}
	
}
