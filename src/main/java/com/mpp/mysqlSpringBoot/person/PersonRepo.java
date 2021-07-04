package com.mpp.mysqlSpringBoot.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {
}
