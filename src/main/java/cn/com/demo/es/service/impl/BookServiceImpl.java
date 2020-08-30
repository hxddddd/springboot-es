package cn.com.demo.es.service.impl;

import cn.com.demo.es.dao.BookDao;
import cn.com.demo.es.entity.Book;
import cn.com.demo.es.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    @Override
    public void addBook(Book book) {
         bookDao.save(book);
    }

    @Override
    public void updateBook(Book book) {
         book=bookDao.findById(book.getBkId()).get();
         bookDao.save(book);
    }

    @Override
    public void deletebook(Book book) {
         bookDao.deleteById(book.getBkId());
    }

    @Override
    public Book searchById(int id) {
        Book book=bookDao.findById(id).get();
        return book;
    }

    @Override
    public List<Book> searchAll() {
       Iterable<Book> all=bookDao.findAll();
       List<Book> bookList=new ArrayList<Book>();
       for(Book book:all){
           bookList.add(book);
       }
        return bookList;
    }
}
