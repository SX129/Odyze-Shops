package com.sx129.odyzeshops.repository;

import com.sx129.odyzeshops.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
