package com.mpp.mysqlSpringBoot.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    @Autowired
    Person person;


    @PostMapping("person")
    public Person postPerson(@RequestBody Person person){
        return personService.create(person);
    }


    @GetMapping ("person/{id}")
    public Person getPerson(@PathVariable(value = "id") int id){
        return personService.find(id);
    }
}
