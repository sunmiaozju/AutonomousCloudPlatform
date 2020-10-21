package com.yeqifu.bus.service;

import com.yeqifu.bus.domain.Customer;
import com.yeqifu.sys.utils.DataGridView;
import com.yeqifu.bus.vo.CustomerVo;

import java.util.List;

public interface ICustomerService {

    /**
     * 查询所有客户
     * @param customerVo
     * @return
     */
    public DataGridView queryAllCustomer(CustomerVo customerVo);

    /**
     * 添加客户
     * @param customerVo
     */
    public void addCustomer(CustomerVo customerVo);

    /**
     * 修改客户
     * @param customerVo
     */
    public void updateCustomer(CustomerVo customerVo);

    /**
     * 删除客户
     * @param phone
     */
    public void deleteCustomer(String phone);

    /**
     * 批量删除客户
     * @param phones
     */
    public void deleteBatchCustomer(String [] phones);

    /**
     * 根据手机号查询客户信息
     * @param phone
     * @return
     */
    public Customer queryCustomerByPhoneNumber(String phone);

    /**
     * 查询客户数据返回集合
     * @param customerVo
     * @return
     */
    List<Customer> queryAllCustomerForList(CustomerVo customerVo);
}
