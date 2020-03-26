package com.cognizant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.MenuItem;

@Service
public class MenuItemService  {
	
	@Autowired
	private MenuItemRepository menurepo;
	
	@Transactional
	public List<MenuItem> getMenuItemListCustomer(){
		return menurepo.getItems();
	}
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		return menurepo.findAll();
	}
	
	@Transactional
	public MenuItem getMenuItem(Long id) {
		return menurepo.getOne(id);
	}
	
	@Transactional
	public void modifyMenuItem(MenuItem menu) {
		menurepo.save(menu);
	}
}
