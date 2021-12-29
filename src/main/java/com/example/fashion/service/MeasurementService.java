package com.example.fashion.service;

import com.example.fashion.model.Customer;
import com.example.fashion.model.Measurements;
import com.example.fashion.repositories.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MeasurementService {
    @Autowired
    MeasurementRepository measurementRepository;
    @Autowired
    CustomerService customerService;

    public List<Measurements> getAllMeasurements(){
        return measurementRepository.findAll();
    }
    public Measurements createNewMeasurements(Measurements measurement,Integer customerId) throws Exception {
        Customer customer = customerService.getByCustomerId(customerId);
        measurement.setDateOfMeasurement(LocalDate.now());
        measurement.setCustomer(customer);
        return measurementRepository.save(measurement);
    }





}
