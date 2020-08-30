package cn.com.demo.es.dao;

import cn.com.demo.es.StartEsApp;
import cn.com.demo.es.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartEsApp.class)
public class TestESBook {
    @Autowired
    private BookDao bookDao;

    @Test
    public void findById(){
        Book book=this.bookDao.findById(2).get();
        System.out.println(book);
        Assert.assertNotNull(book);
    }

    @Test
    public void findAll(){
        Iterable<Book> all=bookDao.findAll();
        List<Book> bookList=new ArrayList<Book>();
        bookList.forEach(book -> System.out.println(book.getBkAuthor()));
    }
}
