package com.wolf.zfdj.test;

import com.wolf.zfdj.model.Customer;
import com.wolf.zfdj.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceTest {
    private final CustomerService customerService;


    public CustomerServiceTest(CustomerService customerService) {
        this.customerService = customerService;
    }
    @Before()
    public void init(){
        //TODO:初始化数据
    }
    @Test
    public  void getCustomerListTest(){
         List<Customer> customerList = customerService.getCustomerList();
         Assert.assertEquals(2, customerList.size());
     }
     @Test
    public void getCustomerTest(){
        long id=1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
     }
    @Test
     public void createCustomerTest(){
        Map<String,Object> filedMap = new HashMap<String ,Object>();
        filedMap.put("name","customer100");
        filedMap.put("contact","John");
        filedMap.put("telphone","13935462568");
        boolean result= customerService.createCustomer(filedMap);
        Assert.assertTrue(result);
     }
}
