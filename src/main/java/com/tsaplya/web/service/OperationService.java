package com.tsaplya.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OperationService {
    private final static Logger LOGGER = LoggerFactory.getLogger(OperationService.class);
    private final SumOfNumbersService sumOfNumbersService;
    private final SubtractionOfNumbersService subtractionOfNumbersService;

    @Autowired
    public OperationService(SumOfNumbersService sumOfNumbersService, SubtractionOfNumbersService subtractionOfNumbersService) {
        this.sumOfNumbersService = sumOfNumbersService;
        this.subtractionOfNumbersService = subtractionOfNumbersService;
    }

    public int getSumOfNumbers(int firstNumber, int secondNumber){
        LOGGER.info("looking sum");
        return sumOfNumbersService.sumNumbers(firstNumber, secondNumber);
    }

    public int getSubtractionNumbers(int firstNumber, int secondNumber){
        LOGGER.info("looking subtraction");
        return subtractionOfNumbersService.subtractionNumbers(firstNumber, secondNumber);
    }
}
