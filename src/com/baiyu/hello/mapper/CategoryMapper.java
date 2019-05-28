package com.baiyu.hello.mapper;

import com.baiyu.hello.pojo.Category;
import com.baiyu.hello.pojo.Page;

import java.util.List;

public interface CategoryMapper {
    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> list();

    public List<Category> list(Page page);

    public int total();
}
