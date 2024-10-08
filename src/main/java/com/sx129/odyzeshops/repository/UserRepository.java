package com.sx129.odyzeshops.repository;

import com.sx129.odyzeshops.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
