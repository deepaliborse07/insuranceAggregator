package com.demo.insuranceApplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.insuranceApplication.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
