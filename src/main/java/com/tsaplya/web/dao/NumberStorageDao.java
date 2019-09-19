package com.tsaplya.web.dao;

import com.tsaplya.web.model.NumberStorage;
import org.springframework.data.repository.CrudRepository;

public interface NumberStorageDao extends CrudRepository<NumberStorage, Long> {
}
