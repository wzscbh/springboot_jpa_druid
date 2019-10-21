package com.hzcbh.demo.service.impl;

import com.hzcbh.demo.dao.ItemRepository;
import com.hzcbh.demo.domain.Item;
import com.hzcbh.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Override
    public List<Item> findAll(Item item) {

        Example<Item> example = Example.of(item);
        List<Item> list = itemRepository.findAll(example);
        System.out.println(list);
        return list;
    }
}
