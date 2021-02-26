package indi.ryan.igreendatachallenge.controller;

import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.TransactionInfo;
import indi.ryan.igreendatachallenge.service.ITransactionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/account")
@Slf4j
@Api(tags = "Transaction Information")
public class TransactionInfoController {

    @Autowired
    private ITransactionService transactionService;

    @ApiOperation(value = "list transaction information by account ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "page number", defaultValue = "1", required = false)
    })
    @GetMapping("{accountId}/transaction")
    public ResponseEntity<List<TransactionInfo>> getTransacation(@PathVariable("accountId") Long accountId,
                                                                 @RequestParam(name = "page", required = false) Integer page) {
        try {
            return ResponseEntity.ok(transactionService.getTransaction(accountId, page == null || page < 1 ? 1 : page));
        } catch (ServiceException ex) {
            log.error("get account information error {} and error code is {}", ex.getMessage(), ex.getErrorCode());
            return ResponseEntity.status(ex.getHttpStatus()).body(null);
        }
    }
}
