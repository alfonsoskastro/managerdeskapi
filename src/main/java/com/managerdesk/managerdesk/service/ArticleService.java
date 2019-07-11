package com.managerdesk.managerdesk.service;

import java.util.List;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managerdesk.managerdesk.dto.bean.ArticleBean;
import com.managerdesk.managerdesk.dto.repository.ArticleRepository;
import com.managerdesk.managerdesk.mapping.ArticleMapping;

@Service
public class ArticleService {

	@Autowired
	ArticleRepository articleRepository;

	public List<ArticleMapping> getAllArticles() {

		List<ArticleBean> articles = Lists.newArrayList(articleRepository.findAll());
		return ArticleMapping.mapEntityToStoreHeader(articles);

	}

}
