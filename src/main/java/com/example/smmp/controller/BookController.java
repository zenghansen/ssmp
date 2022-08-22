package com.example.smmp.controller;

import com.example.smmp.controller.utlis.R;
import com.example.smmp.domain.Book;
import com.example.smmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private IBookService iBookService;
//
//    @GetMapping
//    public R getAll(){
//
//        List<Book> list = iBookService.list();
//        return new R(true,list);
//
//    }

    @GetMapping("page/{page}/{pageSize}")
    public R getPage(@PathVariable int page, @PathVariable int pageSize) throws Exception {

        List<Book> list = iBookService.getPage(page,pageSize);
        if(true) throw  new Exception("error");

        return new R(true,list);

    }

}
