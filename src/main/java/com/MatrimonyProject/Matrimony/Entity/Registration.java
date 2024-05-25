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
public class Registration
{
	  @Id
	  @GeneratedValue (strategy = GenerationType.AUTO)
      int Registration_ID;
      int Age ; 
      String Name;
      String  Gender ; 
      String Caste ;   
      String Religion;
      
	
}
