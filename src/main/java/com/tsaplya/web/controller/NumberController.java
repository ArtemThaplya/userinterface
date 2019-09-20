package com.tsaplya.web.controller;

import com.tsaplya.web.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class NumberController {
    private final OperationService operationService;
    private final static Logger LOGGER = LoggerFactory.getLogger(NumberController.class);

    @Autowired
    public NumberController(OperationService operationService) {
        this.operationService = operationService;
    }

    @RequestMapping(value = "/sum")
    public int getSum(@RequestParam(value = "firstNumber") int firstNumber,
                      @RequestParam(value = "secondNumber") int secondNumber) {
        int sumOfNumbers = operationService.getSumOfNumbers(firstNumber, secondNumber);
        LOGGER.info("Done! Result: "+ sumOfNumbers);
        return sumOfNumbers;
    }

    @RequestMapping(value = "/subtraction", method = GET)
    public int getSubtraction(@RequestParam(value = "firstNumber") int firstNumber,
                              @RequestParam(value = "secondNumber") int secondNumber) {
        int subtractionNumbers = operationService.getSubtractionNumbers(firstNumber, secondNumber);
        LOGGER.info("Done! Result: "+ subtractionNumbers);
        return subtractionNumbers;
    }
}
