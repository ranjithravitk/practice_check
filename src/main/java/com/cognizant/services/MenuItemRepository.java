package com.cognizant.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.models.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem	, Long> {

	
	@Query("select e from MenuItem e where e.active like true and e.dateOfLaunch <='2020-03-26'")
	public List<MenuItem> getItems();
}
