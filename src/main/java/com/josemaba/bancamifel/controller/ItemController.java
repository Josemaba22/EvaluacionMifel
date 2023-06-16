package com.josemaba.bancamifel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.josemaba.bancamifel.entity.Item;
import com.josemaba.bancamifel.service.Impl.ItemServiceImpl;

@RestController
@RequestMapping("/api/item")
public class ItemController {
	
	@Autowired
	private ItemServiceImpl itemService;
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})	
	@GetMapping("/get_items")
	public ResponseEntity<?> getItem(@RequestParam(required = false) String name){
		
		if(name == null || name.isEmpty()) {
			List<Item> items = itemService.findAll();
			return new ResponseEntity<>(items,HttpStatus.OK);
		} else {
			List<Item> items = itemService.findByName(name);
			return new ResponseEntity<>(items,HttpStatus.OK);
		}
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}
	

	
	
	
	
}
