package indi.ryan.igreendatachallenge.controller;

import indi.ryan.igreendatachallenge.exception.AppErrorCode;
import indi.ryan.igreendatachallenge.exception.ControllerException;
import indi.ryan.igreendatachallenge.exception.ServiceException;
import indi.ryan.igreendatachallenge.persistence.entity.Account;
import indi.ryan.igreendatachallenge.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/customer")
@Slf4j
@Api(tags = "Account Information")
public class AccountInfoController {

    @Autowired
    private IAccountService accountService;

    @ApiOperation(value = "list account information by customer ID")
    @GetMapping("{customerId}/account")
    public ResponseEntity<List<Account>> getAllAccount(@PathVariable("customerId") Long customerId) {
        try {
            return ResponseEntity.ok(accountService.getAllAccount(customerId));
        } catch (ServiceException e) {
            HttpStatus httpStatus = AppErrorCode.getResponseStatus(e.getErrorCode());
            if (HttpStatus.OK == httpStatus) {
                log.warn("Warning {} and code is {}", e.getMessage(), e.getErrorCode());
                return ResponseEntity.status(httpStatus).body(Collections.emptyList());
            }
            log.error("get account information error {} and error code is {}", e.getMessage(), e.getErrorCode());
            throw new ControllerException(httpStatus, e.getMessage());
        }
    }
}
