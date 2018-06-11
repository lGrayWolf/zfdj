package com.wolf.zfdj.service;

import com.wolf.zfdj.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
public class CustomerService  {
    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(){
        //TODO:
        return null;
    }

    /**
     * 获取客户信息
     * @param id
     * @return
     */
    public  Customer getCustomer(long id){
        return null;
    }
    /**
     *更新客户
     * @param fieldMap
     * @return
     */
    public  boolean updateCustomer(Map<String,Object> fieldMap){
        return true;
    }
    /**
     *创建客户
     * @param fieldMap
     * @return
     */
    public  boolean createCustomer(Map<String,Object> fieldMap){
        return true;
    }

    /**
     *创建客户
     * @param fieldMap
     * @return
     */
    public  boolean deleteCustomer(Map<String,Object> fieldMap){
        return true;
    }
}
