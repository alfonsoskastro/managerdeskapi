package com.managerdesk.managerdesk.dto.repository;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.CrudRepository;

import com.managerdesk.managerdesk.dto.bean.ArticleBean;

@Document
public interface ArticleRepository extends CrudRepository<ArticleBean, String>{

}
