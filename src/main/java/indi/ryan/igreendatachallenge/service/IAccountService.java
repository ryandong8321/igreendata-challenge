package indi.ryan.igreendatachallenge.service;

import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.Account;

import java.util.List;

public interface IAccountService {

    List<Account> getAllAccount(Long customerId) throws ServiceException;

}
