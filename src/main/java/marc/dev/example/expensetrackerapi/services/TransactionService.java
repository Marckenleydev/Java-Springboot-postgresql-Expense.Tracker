package marc.dev.example.expensetrackerapi.services;

import marc.dev.example.expensetrackerapi.entities.Transaction;
import marc.dev.example.expensetrackerapi.exceptions.EtBadRequestException;
import marc.dev.example.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionService {
    List<Transaction> fetchAllTransactions(Integer userId,Integer categoryId);
    Transaction fetchTransactionsById(Integer userId,Integer categoryId,Integer transactionId) throws EtResourceNotFoundException;


    Transaction addtransaction(Integer userId,Integer categoryId,Double amount,String note, Long transactionDate) throws EtBadRequestException;
    void updateTransaction(Integer userId,Integer categoryId,Integer transactionId, Transaction transaction) throws EtBadRequestException;
    void removeTransactionById(Integer userId,Integer categoryId,Integer transactionId) throws EtBadRequestException;



}
