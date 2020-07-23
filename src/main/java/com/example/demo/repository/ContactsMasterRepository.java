package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.ContactsMastersEntity;

public interface ContactsMasterRepository 
					extends CrudRepository<ContactsMastersEntity, Serializable> {

}
