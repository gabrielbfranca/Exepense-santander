package com.expenses.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenses.tracker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
