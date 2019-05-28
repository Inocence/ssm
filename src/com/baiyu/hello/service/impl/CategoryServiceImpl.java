package com.baiyu.hello.service.impl;

import com.baiyu.hello.mapper.CategoryMapper;
import com.baiyu.hello.pojo.Category;
import com.baiyu.hello.pojo.Page;
import com.baiyu.hello.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list(){
        return categoryMapper.list();
    }
    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }
    @Override
    public int total() {
        return categoryMapper.total();
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public void addTwo(){
        Category category = new Category();
        category.setName("新增1");
        categoryMapper.add(category);

        Category category1 = new Category();
        category1.setName("新增2新增2新增2新增2新增2新增2新增2");
        categoryMapper.add(category1);
    }
}
