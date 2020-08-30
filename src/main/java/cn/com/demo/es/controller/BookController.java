package cn.com.demo.es.controller;

import cn.com.demo.es.entity.Book;
import cn.com.demo.es.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public String initPage(Model model){
        model.addAttribute("book",new Book());
        return "book";
    }
    @GetMapping("/book/{bkId}")
    public String searchBook(@PathVariable("bkId") int bkId,Model model){
        Book book=this.bookService.searchById(bkId);
        model.addAttribute("book",book);
        return "book";
    }
    @PostMapping("/book")
    public String addBook(Book book){
        this.bookService.addBook(book);
        return "book";
    }
    @PutMapping("/book")
    public String editBook(Book book){
        this.bookService.updateBook(book);
        return  "book";
    }
    @DeleteMapping("/book")
    public String deleteBook(Book book){
        this.bookService.deletebook(book);
        return "redirect:/book";
    }
    @GetMapping("/bookList")
    public String bookList(Model model){
        List<Book> bookList=this.bookService.searchAll();
        model.addAttribute("bookList",bookList);
        return "bookList";
    }
}
