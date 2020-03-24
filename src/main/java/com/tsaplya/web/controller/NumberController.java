package com.tsaplya.web.controller;

import com.tsaplya.web.model.Numbers;
import com.tsaplya.web.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NumberController {
    private final OperationService operationService;
    private final static Logger LOGGER = LoggerFactory.getLogger(NumberController.class);

    @Autowired
    public NumberController(OperationService operationService) {
        this.operationService = operationService;
    }

    @PostMapping("/sum")
    public ResponseEntity<String> getSum(@RequestBody Numbers numbers) {
        int sumOfNumbers = operationService
            .getSumOfNumbers(numbers.getFirstNumber(), numbers.getSecondNumber());
        LOGGER.info("Done! Result: "+ sumOfNumbers);
        return ResponseEntity.ok("");
    }

    @PostMapping("/subtraction")
    public ResponseEntity<String> getSubtraction(
        @RequestBody Numbers numbers) {
        int subtractionNumbers = operationService
            .getSubtractionNumbers(numbers.getFirstNumber(), numbers.getSecondNumber());
        LOGGER.info("Done! Result: "+ subtractionNumbers);
        return ResponseEntity.ok("");
    }
}
