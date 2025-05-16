package com.lombard.lombard.repositories;

import com.lombard.lombard.models.Item;
import com.lombard.lombard.models.Transaction;
import com.lombard.lombard.models.TransactionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionItemRepository extends JpaRepository<TransactionItem, Integer> {

    List<TransactionItem> findByTransaction(Transaction transaction);

    List<TransactionItem> findByItem(Item item);

    void deleteByTransaction(Transaction transaction);
}