package com.managerdesk.managerdesk.mapping;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import java.lang.reflect.Type;
import com.managerdesk.managerdesk.dto.bean.ArticleBean;

public class ArticleMapping {

	/***
	 * Maps Store DTO to Store Entity
	 * 
	 * @param storeRequest
	 * @return
	 */
	public static ArticleBean mapArticleResponseToArticleBean(ArticleMapping articleMapping) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(articleMapping, ArticleBean.class);
	}

	/**
	 * Maps Store entity to Store response DTO
	 * 
	 * @param store
	 * @return
	 */
	public static ArticleMapping mapArticleBeanArticleResponse(ArticleBean articleBean) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(articleBean, ArticleMapping.class);
	}
	
    public static List<ArticleMapping> mapEntityToStoreHeader(List<ArticleBean> stores) {
        Type listType = new TypeToken<List<ArticleMapping>>() {}.getType();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(stores,listType);
    }

}
