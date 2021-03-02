package indi.ryan.igreendatachallenge.controller;

import indi.ryan.igreendatachallenge.IgreendataChallengeApplicationTests;
import indi.ryan.igreendatachallenge.exception.AppErrorCode;
import indi.ryan.igreendatachallenge.exception.ControllerException;
import indi.ryan.igreendatachallenge.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@Slf4j
public class AccountControllerTest extends IgreendataChallengeApplicationTests {

    @Autowired
    private AccountInfoController accountInfoController;
    private MockMvc mockMvc;

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.standaloneSetup(accountInfoController).build();
    }

    @Test
    public void testEnable() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/customer/1/account"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void testCorrect() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/customer/3/account"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

        String expected = "[{\"id\":12,\"accountName\":\"nab_01\",\"bsb\":\"222222\",\"accountNumber\":\"001003001\"}]";
        Assert.assertEquals(expected, mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void testIncorrect() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/customer/a10/account"))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
