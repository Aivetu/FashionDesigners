package com.example.fashion.repositories;

import com.example.fashion.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByFirstnameAndLastname(String firstname,String lastname);

}
