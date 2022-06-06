package com.example.ebook.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ebook.model.OrderTemp;

@Repository
public interface OrderTempRepo extends CrudRepository<OrderTemp, String>{

	List<OrderTemp> findByUserId(String id);

}
