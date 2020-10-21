package com.yeqifu.bus.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yeqifu.bus.domain.Customer;
import com.yeqifu.bus.mapper.CustomerMapper;
import com.yeqifu.bus.service.ICustomerService;
import com.yeqifu.sys.utils.DataGridView;
import com.yeqifu.bus.vo.CustomerVo;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Log4j
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询所有客户信息 分页
     * @param customerVo
     * @return
     */
    @Override
    public DataGridView queryAllCustomer(CustomerVo customerVo) {
        Page<Object> page = PageHelper.startPage(customerVo.getPage(),customerVo.getLimit());
        List<Customer> data = this.customerMapper.queryAllCustomer(customerVo);

        return new DataGridView(page.getTotal(),data);
    }

    /**
     * 添加一个客户
     * @param customerVo
     */
    @Override
    public void addCustomer(CustomerVo customerVo) {
        this.customerMapper.insertSelective(customerVo);
    }

    /**
     * 更新一个客户
     * @param customerVo
     */
    @Override
    public void updateCustomer(CustomerVo customerVo) {
        this.customerMapper.updateByPrimaryKeySelective(customerVo);
    }

    /**
     * 删除一个客户
     * @param phone
     */
    @Override
    public void deleteCustomer(String phone) {
        log.info("phone" + phone);
        this.customerMapper.deleteByPrimaryKey(phone);
    }

    /**
     * 批量删除客户
     * @param phones
     */
    @Override
    public void deleteBatchCustomer(String[] phones) {
        for (String phone : phones) {
            this.deleteCustomer(phone);
        }

    }

    /**
     * 通过手机号查询客户
     * @param phone
     * @return
     */
    @Override
    public Customer queryCustomerByPhoneNumber(String phone) {
        return this.customerMapper.selectByPrimaryKey(phone);
    }

    /**
     * 查询所有客户数据不分页
     * @param customerVo
     * @return
     */
    @Override
    public List<Customer> queryAllCustomerForList(CustomerVo customerVo) {
        return this.customerMapper.queryAllCustomer(customerVo);
    }
}
