package com.example.fristproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fristproject.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}