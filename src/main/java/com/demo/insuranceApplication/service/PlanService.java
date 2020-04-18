package com.demo.insuranceApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.insuranceApplication.entity.Plan;
import com.demo.insuranceApplication.repos.PlanRepository;

@Service
public class PlanService {
	
	@Autowired
	private PlanRepository repos;

	
//findall
	public List<Plan> getPlan() {
		return this.repos.findAll();
	}

//add
	public Plan add(Plan plan) {
		// TODO Auto-generated method stub
		return this.repos.save(plan);
	}

//findbyid
	public Plan findByPid(int id) {
		// TODO Auto-generated method stub
		return this.repos.findById(id).get();
	}
	
//update
	public Plan getDetails(int id) {
		// TODO Auto-generated method stub
		return this.repos.findById(id).get();
	}
	
//delete
	public void deletedetails(Plan policyDetails) {
		// TODO Auto-generated method stub
		this.repos.delete(policyDetails);
		
	}

}
