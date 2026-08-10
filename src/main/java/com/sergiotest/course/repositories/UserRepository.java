package com.sergiotest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotest.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
