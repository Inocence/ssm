package com.baiyu.hello.service;

import com.baiyu.hello.pojo.Category;
import com.baiyu.hello.pojo.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list();
    List<Category> list(Page page);
    int total();
    void addTwo();
}
