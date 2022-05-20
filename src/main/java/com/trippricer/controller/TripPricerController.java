package com.trippricer.controller;

import com.trippricer.exception.UUIDException;
import com.trippricer.service.TripPricerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

@RestController
public class TripPricerController {

    @Autowired
    TripPricerService tripPricerService;

    /**
     *
     * @return a list of Provider objects
     * to the port 9010
     * @throws UUIDException
     */
    @GetMapping("/getProvider")
    public List<Provider> getProviderFromService (@RequestParam String apiKey, String attractionId, int adults, int children,
                                                  int nightsStay, int rewardsPoints) throws UUIDException {
        UUID attractionIdToUUID = null;
        try {
            attractionIdToUUID = UUID.fromString(attractionId);
        } catch (IllegalArgumentException e){
           throw  new UUIDException(attractionId);
        }
        return tripPricerService.getProviderFromTripPricer(apiKey,attractionIdToUUID,adults,children,nightsStay,rewardsPoints);
    }
}
