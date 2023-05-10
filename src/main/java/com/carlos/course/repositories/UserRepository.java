package com.carlos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
