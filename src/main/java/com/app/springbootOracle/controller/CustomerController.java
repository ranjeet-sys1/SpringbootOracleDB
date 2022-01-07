package com.app.springbootOracle.controller;

import com.app.springbootOracle.model.Customer;
import com.app.springbootOracle.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

/*author:ranjeet.suman
/* Created on 07/01/22 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/save")
    @RequestMapping(path="/save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public ResponseEntity saveCustomer(@RequestBody Customer customer){
        Customer saveCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity(saveCustomer,HttpStatus.CREATED);
    }

}
