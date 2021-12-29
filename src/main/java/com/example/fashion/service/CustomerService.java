package com.example.fashion.service;

import com.example.fashion.model.Customer;
import com.example.fashion.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomerList(){
        return customerRepository.findAll();
    }

    public Customer createCustomerProfile(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getByCustomerId(int id)throws Exception{
        Optional<Customer> optional = customerRepository.findById(id);
        if (optional.isPresent())
            return optional.get();
        else throw  new Exception("Customer does not exist");
    }
    public Optional<Customer> getCustomerByFirstname(String firstname,String lastname){
        return customerRepository.findByFirstnameAndLastname(firstname,lastname);
    }





}
