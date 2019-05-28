package com.baiyu.hello.controller;

import com.baiyu.hello.pojo.Category;
import com.baiyu.hello.pojo.Page;
import com.baiyu.hello.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Category> cs = categoryService.list();
        int total = (int) new PageInfo<>(cs).getTotal();
        page.calLast(total);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("cs", cs);
        modelAndView.setViewName("listCategory");

        return modelAndView;
    }
}
