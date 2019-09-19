package com.tsaplya.web.service.Implementation;

import com.tsaplya.web.dao.NumberStorageDao;
import com.tsaplya.web.model.NumberStorage;
import com.tsaplya.web.service.Interfaces.SubtractionOfNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubtractionOfNumbersImp implements SubtractionOfNumbersService {
    private final NumberStorageDao numberStorageDao;

    @Autowired
    public SubtractionOfNumbersImp(NumberStorageDao numberStorageDao) {
        this.numberStorageDao = numberStorageDao;
    }
    public int subtractionNumbers(int firstNumber, int secondNumber) {
        int number = 0;
        Iterable<NumberStorage> optionalNumberStorage = numberStorageDao.findAll();
        for (NumberStorage numberStorage : optionalNumberStorage) {
            number = numberStorage.getMagicNumber();
        }
        return firstNumber - secondNumber + number;
    }
}
