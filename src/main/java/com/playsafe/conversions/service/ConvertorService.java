package com.playsafe.conversions.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ConvertorService {
    
    Logger logger = LoggerFactory.getLogger(ConvertorService.class);
    
    public double ctok(double celcius) {
    	return celcius + 273.15;
    }
    
    public double ktoc(double kelvin) {
    	return kelvin - 273.15;
    }
    
    public double mtok(double miles) {
    	return miles*1.609;
    }
    
    public double ktom(double kilometers) {
    	return kilometers/1.609;
    }
    
    
    
    
    

}
