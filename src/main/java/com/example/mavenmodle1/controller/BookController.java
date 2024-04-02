package com.example.mavenmodle1.controller;


import com.example.mavenmodle1.bookList.Book;
import com.example.mavenmodle1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookServiceImp;

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","SpringMVC正常");
        return "test";
    }

    @RequestMapping("/addBook")
    @ResponseBody
    //@RequestBody 注解用于告诉 Spring MVC 将请求体中的 JSON 数据转换为对应对象
    public Result addBook(@RequestBody Book book){
        System.out.println(book);
        bookServiceImp.addBook(book);
        return new Result(Type.BOOK_INSERT);
    }

    @RequestMapping("/deleteBook/{bookID}")
    @ResponseBody
    public Result deleteBook(@PathVariable int bookID){
        bookServiceImp.deleteBookByID(bookID);
        return new Result(Type.BOOK_DELETE);
    }

    @RequestMapping("/updateBook")
    @ResponseBody
    public Result updateBook(@RequestBody Book book){
        bookServiceImp.updateBook(book);
        return new Result(Type.BOOK_UPDATE);
    }

    @RequestMapping("/allBook")
    @ResponseBody
    public Result allBook(){
        List<Book> books = bookServiceImp.selectAllBook();
        int type = books.size() > 0 ? Type.BOOK_SELECT : Type.BOOK_SELECT_ERR;
        return new Result(books,type);
    }

    @RequestMapping("/selectBookByName/{bookName}")
    @ResponseBody
    public Result selectBookByName(@PathVariable String bookName){
        List<Book> books = bookServiceImp.selectBookByName(bookName);
        int type = books.size() > 0 ? Type.BOOK_SELECT : Type.BOOK_SELECT_ERR;
        return new Result(books,type);
    }

    @RequestMapping("/selectBookByID/{bookID}")
    @ResponseBody
    public Result selectBookByID(@PathVariable int bookID){
        Book book = bookServiceImp.selectBookByID(bookID);
        int type = book != null ? Type.BOOK_SELECT : Type.BOOK_SELECT_ERR;
        return new Result(book,type);
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}