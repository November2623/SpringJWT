package com.duytran.demo.service;

import com.duytran.demo.model.News;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {
    public List<News> getAllNews(){
        List<News> newsList = new ArrayList<News>();
        newsList.add(new News("Title 1", "Content1", "Ngoc Duy"));
        newsList.add(new News("Title 2", "Content2", "Duy Tran"));
        newsList.add(new News("Title 3", "Content3", "Tran Ngo Duy"));
        return newsList;
    }
}