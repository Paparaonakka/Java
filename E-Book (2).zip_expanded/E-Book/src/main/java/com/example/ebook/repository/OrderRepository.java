package com.example.ebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebook.model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, String> {

}
