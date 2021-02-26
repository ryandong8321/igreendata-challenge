package indi.ryan.igreendatachallenge.service;

import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.TransactionInfo;

import java.util.List;

public interface ITransactionService {

    List<TransactionInfo> getTransaction(Long accountId, int page) throws ServiceException;

}
