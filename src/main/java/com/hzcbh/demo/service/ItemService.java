package com.hzcbh.demo.service;

import com.hzcbh.demo.domain.Item;

import java.util.List;

public interface ItemService {

    void save(Item item);

    List<Item> findAll(Item item);
}
