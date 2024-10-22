package com.example.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.picpaysimplificado.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}
