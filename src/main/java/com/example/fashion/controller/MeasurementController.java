package com.example.fashion.controller;

import com.example.fashion.model.Customer;
import com.example.fashion.model.Measurements;
import com.example.fashion.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/measurement")
public class MeasurementController {
    @Autowired
    MeasurementService measurementService;

    @GetMapping(value = "")
    public List<Measurements> getMeasurements(){
        return measurementService.getAllMeasurements();
    }
    @PostMapping(value = "/{customer}")
    public Measurements createNewMeasurements(@PathVariable ("customer") Integer id,@RequestBody Measurements measurement)throws Exception{
        return measurementService.createNewMeasurements(measurement,id) ;
    }

}
