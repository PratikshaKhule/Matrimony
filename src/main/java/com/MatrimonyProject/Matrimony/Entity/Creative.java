package com.MatrimonyProject.Matrimony.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Creative {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String Hobbies;
	String Fitness;
	String other;
	String Entertainment;
	
}
