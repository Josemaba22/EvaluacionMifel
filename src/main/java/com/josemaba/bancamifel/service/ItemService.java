package com.josemaba.bancamifel.service;

import java.util.List;

import com.josemaba.bancamifel.entity.Item;

public interface ItemService {

	public List<Item> findAll();
	
	public void save (Item user);
	
	public Item findById(Long id);
	
	public List<Item> findByName(String name);
}
