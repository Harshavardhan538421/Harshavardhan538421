package com.example.demo;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface UserRepositry extends CrudRepository<User,Id> {

}
