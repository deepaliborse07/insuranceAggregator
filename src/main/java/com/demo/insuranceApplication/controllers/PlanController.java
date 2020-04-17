package com.demo.insuranceApplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.insuranceApplication.entity.Plan;
import com.demo.insuranceApplication.service.PlanService;


@RestController
public class PlanController {
	
	@Autowired
	private PlanService service;
	
	@GetMapping("plan")
	public List<Plan> findAllPlans(){
		return service.getPlan();
		
	}
	
	
	@GetMapping("plan/{id}")
	public Plan getPlanId(@PathVariable("id") int id) {
		
		Plan plan=this.service.findByPid(id);
		return plan;
		
	}
	
	@PostMapping("plan")
	public Plan addPlan(@RequestBody Plan plan) {
		
		return this.service.add(plan);
		
	}
	
	@PutMapping("plan/{id}")
	public Plan update(@PathVariable("id") int id,@RequestBody Plan plan) {
		
		Plan plandetails=this.service.getDetails(id);
		
		plandetails.setPolicyName(plan.getPolicyName());
		
		plandetails.setType(plan.getType());
		
		plandetails.setAge(plan.getAge());
		
		plandetails.setCoverage(plan.getCoverage());
		
		plandetails.setMonthlyAmount(plan.getMonthlyAmount());
				
		return this.service.add(plandetails);
		
	}


	
	
	@DeleteMapping("plan/{id}")
	public void deletePolicy(@PathVariable("id") int id) {
		
		Plan policyDetails=this.service.getDetails(id);
		
		if(policyDetails!=null) {
			this.service.deletedetails(policyDetails);
		}
	}
}
