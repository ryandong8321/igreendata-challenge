package indi.ryan.igreendatachallenge.service;

import indi.ryan.igreendatachallenge.persistence.entity.TransactionInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class TransactionServiceTest {

    @Autowired
    private ITransactionService transactionService;

    @Test
    public void testCorrect() {
        List<TransactionInfo> transactionInfos = transactionService.getTransaction(1l, 1);
        transactionInfos.stream().map(ti -> ti.getId()).forEach(System.out::println);
        Assert.assertEquals(3, transactionInfos.size());
    }

    @Test
    public void testIncorrect() {
        List<TransactionInfo> transactionInfos = transactionService.getTransaction(-1l, 0);
        Assert.assertEquals(1, transactionInfos.size());
    }
}
