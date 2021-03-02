package indi.ryan.igreendatachallenge.service.impl;

import indi.ryan.igreendatachallenge.exception.AppErrorCode;
import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.TransactionInfo;
import indi.ryan.igreendatachallenge.persistence.repository.TransactionRepository;
import indi.ryan.igreendatachallenge.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("transactionService")
public class TransactionServiceImpl implements ITransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    private final int _page_size = 3;

    @Override
    public List<TransactionInfo> getTransaction(Long accountId, int page) throws ServiceException {
        if (accountId == null || accountId <= 0) {
            throw new ServiceException(AppErrorCode.MISSING_PARAM, "account id is invalid");
        }
        Page<TransactionInfo> transactionInfoPage =
                transactionRepository.findTransactionInfosByAccountDetail_Id(accountId, PageRequest.of(--page,
                        _page_size));
        return transactionInfoPage.getContent();
    }
}
