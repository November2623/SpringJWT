package com.duytran.demo.controller;

import com.duytran.demo.model.News;
import com.duytran.demo.repository.NewsRepository;
import com.duytran.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/news")
public class NewsRestController {
    @Autowired
    NewsService newsService;

    @Autowired
    NewsRepository newsRepository;

    @GetMapping
    public List<News> getAllNews(){
        return newsRepository.findAll();
    }

    @PostMapping
    @ResponseBody
    public void addNews(@RequestBody News news){
        newsRepository.save(news);
    }

    @DeleteMapping("/{content}")
    public void deteteNews(@PathVariable("content") String content){
        newsRepository.removeByContent(content);
    }

    public ResponseEntity abc() {
        try{

        }
//        return ResponseEntity.ok("save user is succ ..");
        return ResponseEntity.badRequest().body("username is incorrect");
        return ResponseEntity.badRequest().
    }
}