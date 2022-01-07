package com.app.springbootOracle.service;

import com.app.springbootOracle.model.Customer;
import com.app.springbootOracle.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*author:ranjeet.suman
/* Created on 07/01/22 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
