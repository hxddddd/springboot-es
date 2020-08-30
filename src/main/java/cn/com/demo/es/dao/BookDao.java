package cn.com.demo.es.dao;

import cn.com.demo.es.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookDao extends ElasticsearchRepository<Book, Integer>{
}
