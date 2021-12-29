package com.example.fashion.controller;

import com.example.fashion.model.Customer;
import com.example.fashion.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value = "")
    public List<Customer> getCustomerList(){
        return customerService.getCustomerList();
    }
    @PostMapping(value = "")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomerProfile(customer);
    }
    @GetMapping(value = "/{id}")
    public Customer getCustomerById(@RequestParam("id") Integer id)throws Exception{
        return customerService.getByCustomerId(id);
    }
    @GetMapping(value = "/search")
    public Optional<Customer> getCustomerByFirstName(@RequestParam("firstname") String firstname,@RequestParam ("lastname")String lastname){
        return customerService.getCustomerByFirstname(firstname, lastname);
    }


}
