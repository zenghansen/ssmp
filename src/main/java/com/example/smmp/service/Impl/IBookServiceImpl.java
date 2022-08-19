package com.example.smmp.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.smmp.dao.BookDao;
import com.example.smmp.domain.Book;
import com.example.smmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBookServiceImpl extends ServiceImpl<BookDao,Book> implements IBookService
{

    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> getPage(int current,int size) {
        IPage iPage = new Page(current,size);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.gt("id",2);
        bookDao.selectPage(iPage,queryWrapper);
        return iPage.getRecords();
    }
}
