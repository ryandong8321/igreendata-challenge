package indi.ryan.igreendatachallenge.service;

import indi.ryan.igreendatachallenge.exception.AppErrorCode;
import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class AccoutServiceTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testCorrect() {
        List<Account> accountList = accountService.getAllAccount(3l);
        accountList.stream().map(account -> account.getId()).forEach(System.out::println);
        Assert.assertEquals(1, accountList.size());
    }

    @Test
    public void testIncorrect() {
        try {
            accountService.getAllAccount(-3l);
        }catch (ServiceException ex) {
            Assert.assertEquals(HttpStatus.NOT_FOUND, AppErrorCode.getResponseStatus(ex.getErrorCode()));
        }
    }
}
