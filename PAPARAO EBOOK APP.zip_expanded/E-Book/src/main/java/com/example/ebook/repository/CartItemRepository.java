package com.example.ebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebook.model.CartItemModel;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemModel, String> {

}
