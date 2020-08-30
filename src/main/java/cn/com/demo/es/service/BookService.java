package cn.com.demo.es.service;

import cn.com.demo.es.entity.Book;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deletebook(Book book);
    public Book  searchById(int id);
    public List<Book> searchAll();
}
