package com.example.ebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebook.model.CartModel;

@Repository
public interface CartRepository extends JpaRepository<CartModel, String> {
	
}

