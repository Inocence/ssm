package com.baiyu.hello;

import com.baiyu.hello.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Main {
    @Autowired
    private CategoryService categoryService;
    @Test
    public void main() {
        categoryService.addTwo();
    }
}
