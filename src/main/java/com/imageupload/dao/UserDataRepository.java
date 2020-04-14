package com.imageupload.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.imageupload.model.User;



public interface UserDataRepository extends CrudRepository<com.imageupload.model.User, Integer> {

	@Query("From User u where u.id = :id")
	User findUser(@Param("id") int id);
}
