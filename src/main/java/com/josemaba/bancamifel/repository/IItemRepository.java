package com.josemaba.bancamifel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josemaba.bancamifel.entity.Item;

@Repository
public interface IItemRepository extends JpaRepository<Item, Long>{

	List<Item> findByName(String name);
}
