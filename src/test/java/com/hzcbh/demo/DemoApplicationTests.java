package com.hzcbh.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.hzcbh.demo.domain.Item;
import com.hzcbh.demo.service.impl.ItemServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DataSource dataSource;
//    private ItemServiceImpl itemService;

    @Test
    void contextLoads() {
        Class<? extends DataSource> aClass = dataSource.getClass();
        System.out.println(aClass);
//        Item item=new Item();
//        item.setAge(20);
//
//        item.setName("xiaozhang");
//        itemService.save(item);

    }

}
