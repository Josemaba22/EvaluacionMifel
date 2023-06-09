package com.josemaba.bancamifel.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josemaba.bancamifel.entity.Item;
import com.josemaba.bancamifel.repository.IItemRepository;
import com.josemaba.bancamifel.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	IItemRepository itemRepo;

	@Override
	public List<Item> findAll() {
		return (List<Item>) itemRepo.findAll();
	}

	@Override
	public void save(Item item) {
		itemRepo.save(item);
		
	}

	@Override
	public Item findById(Long id) {
		return itemRepo.findById(id).orElse(null);
	}

	@Override
	public List<Item> findByName(String name) {
		return (List<Item>) itemRepo.findByName(name);
	}

}
