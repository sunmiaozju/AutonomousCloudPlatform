package com.yeqifu.bus.mapper;

import com.yeqifu.bus.domain.Customer;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(String phone);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String phone);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> queryAllCustomer(Customer customer);
}