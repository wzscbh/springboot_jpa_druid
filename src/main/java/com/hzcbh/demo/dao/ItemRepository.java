package com.hzcbh.demo.dao;

import com.hzcbh.demo.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
