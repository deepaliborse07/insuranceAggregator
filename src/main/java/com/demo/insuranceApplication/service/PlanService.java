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

	public List<Plan> getPlan() {
		// TODO Auto-generated method stub
		return this.repos.findAll();
	}

	public Plan add(Plan plan) {
		// TODO Auto-generated method stub
		return this.repos.save(plan);
	}

	public Plan findByPid(int id) {
		// TODO Auto-generated method stub
		return this.repos.findById(id).get();
	}

	public Plan getDetails(int id) {
		// TODO Auto-generated method stub
		return this.repos.findById(id).get();
	}

	public void deletedetails(Plan policyDetails) {
		// TODO Auto-generated method stub
		this.repos.delete(policyDetails);
		
	}

}
