package com.duytran.demo.repository;

import com.duytran.demo.model.News;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface NewsRepository extends Repository<News, Integer> {
    List<News> findAll();
    News getByTitle(String title);
    void removeByContent(String title);
    void save(News news);

}