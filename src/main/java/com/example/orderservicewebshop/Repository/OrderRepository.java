package com.example.orderservicewebshop.Repository;

import com.example.orderservicewebshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Integer> {
}
