package cn.com.demo.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
@ComponentScan(basePackages = {"cn.com.demo.es.dao","cn.com.demo.es.service.impl","cn.com.demo.es.controller"})
public class StartEsApp {
    public static void main(String[] args) {
        SpringApplication.run(StartEsApp.class,args);
    }
}
