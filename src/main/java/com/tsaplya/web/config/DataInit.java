package com.tsaplya.web.config;

import com.tsaplya.web.dao.NumberStorageDao;
import com.tsaplya.web.model.NumberStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner {
    private final static int MAGIC_NUMBER = 3;
    private NumberStorageDao numberStorageDao;

    @Autowired
    private DataInit(NumberStorageDao numberStorageDao) {
        this.numberStorageDao = numberStorageDao;
    }

    @Override
    public void run(ApplicationArguments args) {
        long countNumberStorageDao = numberStorageDao.count();
        if (countNumberStorageDao == 0) {
            NumberStorage numberStorage = new NumberStorage();
            numberStorage.setMagicNumber(MAGIC_NUMBER);
            numberStorageDao.save(numberStorage);
        }
    }
}
