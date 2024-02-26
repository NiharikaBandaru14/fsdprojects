package com.tcs.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.rest.resource.Investor1;

@Repository
public interface InvestorRepository extends JpaRepository<Investor1, Integer>{

}
