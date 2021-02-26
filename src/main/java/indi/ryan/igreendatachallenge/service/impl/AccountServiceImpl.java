package indi.ryan.igreendatachallenge.service.impl;

import indi.ryan.igreendatachallenge.exception.AppErrorCode;
import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.Account;
import indi.ryan.igreendatachallenge.persistence.repository.AccountRepository;
import indi.ryan.igreendatachallenge.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccount(Long userId) throws ServiceException {
        if (userId == null || userId <= 0) {
            throw new ServiceException(AppErrorCode.ILLEGAL_PARAM, "user id is invalid", HttpStatus.NOT_FOUND);
        }
        return accountRepository.getAccountsByUser_Id(userId);
    }
}
