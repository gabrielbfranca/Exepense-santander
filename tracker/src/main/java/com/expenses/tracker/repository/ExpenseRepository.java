package com.expenses.tracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenses.tracker.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{
    Optional<List<Expense>> findByUserIdOrderByCreatedAtDesc(final Long userId);
}
