package com.example.smmp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.smmp.domain.Book;

import java.util.List;

public interface IBookService extends IService<Book> {
    List<Book> getPage(int current,int size);
}
