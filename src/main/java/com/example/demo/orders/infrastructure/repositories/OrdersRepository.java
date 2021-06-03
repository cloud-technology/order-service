package com.example.demo.orders.infrastructure.repositories;

import com.example.demo.orders.domain.model.entites.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, String>{
    
}
