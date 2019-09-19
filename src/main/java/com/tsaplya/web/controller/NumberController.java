package com.tsaplya.web.controller;

import com.tsaplya.web.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class NumberController {
    private final OperationService operationService;

    @Autowired
    public NumberController(OperationService operationService) {
        this.operationService = operationService;
    }

    @RequestMapping(value = "/sum", method = GET)
    public int getSum(@RequestParam(value = "firstNumber") int firstNumber,
                      @RequestParam(value = "secondNumber") int secondNumber) {
        return operationService.getSumOfNumbers(firstNumber, secondNumber);
    }

    @RequestMapping(value = "/subtraction", method = GET)
    public int getSubtraction(@RequestParam(value = "firstNumber") int firstNumber,
                              @RequestParam(value = "secondNumber") int secondNumber) {
        return operationService.getSubtractionNumbers(firstNumber, secondNumber);
    }
}
