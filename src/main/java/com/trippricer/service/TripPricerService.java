package com.trippricer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tripPricer.Provider;
import tripPricer.TripPricer;

import java.util.List;
import java.util.UUID;

@Service
public class TripPricerService {

    Logger logger = LoggerFactory.getLogger(TripPricerService.class);

    private final TripPricer tripPricer = new TripPricer();

    /**
     *
     * @param apiKey the api key needed
     * @param attractionId the attraction id
     * @param adults number of adults
     * @param children number of children
     * @param nightsStay number of night stayed
     * @param rewardsPoints the reward points generated from reward micro-service
     * @return a list of Providers
     */
    public List<Provider> getProviderFromTripPricer (String apiKey, UUID attractionId, int adults, int children,
                                                     int nightsStay, int rewardsPoints) {
        logger.debug("in TripPricerService getProviderFromTripPricer");
        return tripPricer.getPrice(apiKey,attractionId,adults,children,nightsStay,rewardsPoints);
    }



}
