package com.example.ebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebook.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {
	
}