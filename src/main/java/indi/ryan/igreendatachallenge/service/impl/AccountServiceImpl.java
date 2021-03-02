package indi.ryan.igreendatachallenge.service.impl;

import indi.ryan.igreendatachallenge.exception.AppErrorCode;
import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.Account;
import indi.ryan.igreendatachallenge.persistence.repository.AccountRepository;
import indi.ryan.igreendatachallenge.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccount(Long customerId) throws ServiceException {
        if (customerId == null || customerId <= 0) {
            throw new ServiceException(AppErrorCode.ILLEGAL_PARAM, "customer id is invalid");
        }
        List<Account> result = accountRepository.getAccountsByCustomer_Id(customerId);
        if (result == null || result.isEmpty()) {
            throw new ServiceException(AppErrorCode.CANNOT_FINE_RESULT, "cannot find account information");
        }
        return result;
    }
}
