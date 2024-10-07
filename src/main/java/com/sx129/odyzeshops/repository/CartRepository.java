package com.sx129.odyzeshops.repository;

import com.sx129.odyzeshops.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
