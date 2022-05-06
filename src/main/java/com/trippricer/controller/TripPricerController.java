package com.trippricer.controller;

import com.trippricer.service.TripPricerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripPricerController {

    @Autowired
    TripPricerService tripPricerService;
}
