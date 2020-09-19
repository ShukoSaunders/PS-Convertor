package com.playsafe.conversions.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playsafe.conversions.service.ConvertorService;


@RestController
@RequestMapping("/conversions")
public class ConvetorController {
	
	@Autowired
	ConvertorService convertorService;
    
    Logger logger = LoggerFactory.getLogger(ConvetorController.class);
    
    @GetMapping("/ctok/{input}")
    public String ctok(@PathVariable("input") Double input) {
    	logger.info("[ConvetorController] - Input is:" + input + " degrees celcius");
    	 double output = convertorService.ctok(input);
    	 logger.info("[ConvetorController] - Output is:" + output + " kelvin");
        return "Output is:" + output + " kelvin";
    }
}
