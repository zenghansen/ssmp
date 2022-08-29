package com.example.smmp;

import com.example.smmp.dao.BookDao;
import com.example.smmp.domain.Book;
import com.example.smmp.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmmpApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Autowired
    @Qualifier("IBookServiceImpl")
    private IBookService bookService;


    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(1).toString());

        Book book = new Book();
        book.setName("张三");
        book.setDescription("张三的描述");
        book.setType("社会混混fafafa");
        bookDao.insert(book);


        System.out.printf(bookService.getPage(1,2).toString());

        book.setType("333");
        book.setName("nameafaf");
        book.setDescription("miaoshuafaf");
        book.setId(3);

        System.out.printf(String.valueOf(bookService.getById(1)));


    }

}
