package com.parking.main.repositories;

import com.parking.main.dtos.PersonDTO;
import com.parking.main.models.PersonEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository {

    PersonEntity save(PersonEntity personEntity);

    List<PersonEntity> saveAll(List<PersonEntity> personEntities);

    List<PersonEntity> findAll();

    List<PersonEntity> findAll(List<String> ids);

    PersonEntity findOne(String id);

    long count();

    long delete(String id);

    long delete(List<String> ids);

    long deleteAll();

    PersonEntity update(PersonEntity personEntity);

    long update(List<PersonEntity> personEntities);

    double getAverageAge();

}
