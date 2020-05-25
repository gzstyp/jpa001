package com.fwtai.controller;

import com.fwtai.entity.Book;
import com.fwtai.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-24 23:11
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@RestController
@RequestMapping("/book")
public class BookController{

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private BookRepository bookRepository;

    // http://127.0.0.1:8181/book/findAll
    @GetMapping("/findAll")
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}