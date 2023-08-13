package marc.dev.example.expensetrackerapi.repo;

import marc.dev.example.expensetrackerapi.entities.Transaction;
import marc.dev.example.expensetrackerapi.exceptions.EtBadRequestException;
import marc.dev.example.expensetrackerapi.exceptions.EtResourceNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TransactionRepository {
    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}