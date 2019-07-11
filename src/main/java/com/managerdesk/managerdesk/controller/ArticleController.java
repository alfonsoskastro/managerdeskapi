package com.managerdesk.managerdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.managerdesk.managerdesk.response.ArticleResponse;

@RestController
@RequestMapping("article")
public class ArticleController {

	@GetMapping
	public @ResponseBody ArticleResponse article() {
		return new ArticleResponse("1234", "nombre", 123.2f);
	}
}
