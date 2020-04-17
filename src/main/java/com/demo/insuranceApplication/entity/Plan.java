package com.demo.insuranceApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="plan")
public class Plan {
	
	@Id
	private int id;
	
	private String type;
	private String policyName;
	private int age;
	private long monthlyAmount;
	private long coverage;

}
