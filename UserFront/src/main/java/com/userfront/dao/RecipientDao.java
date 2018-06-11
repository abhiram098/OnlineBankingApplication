package com.userfront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userfront.domain.Recipient;

public interface RecipientDao extends CrudRepository<Recipient, Long>{
	
	List<Recipient> findAll();

	void deleteByName(String recipientName);

	Recipient findByName(String recipientName);

}
