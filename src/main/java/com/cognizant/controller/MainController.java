package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.cognizant.services.MenuItemService;

@Controller
public class MainController {
	 @Autowired
		private MenuItemService menuitemService;
		

	@GetMapping("/")
	public void get() {
		System.out.println(menuitemService.getMenuItemListAdmin());
		System.out.println(menuitemService.getMenuItemListCustomer());
	}
}