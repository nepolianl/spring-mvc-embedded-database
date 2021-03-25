package com.neps.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neps.spring.domain.WebOrder;

@Repository
public interface WebOrderRepository extends JpaRepository<WebOrder, Integer> {

}
