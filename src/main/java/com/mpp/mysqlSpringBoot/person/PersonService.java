package com.mpp.mysqlSpringBoot.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepo personRepo;

    @Autowired
    Person person;

    public Person create(Person person){
       return  personRepo.save(person);
    }
    public Person find(int  id){
        return  personRepo.findById(id).orElse(null);
    }
}
