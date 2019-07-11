package com.managerdesk.managerdesk.response;

import java.io.Serializable;

public class ArticleResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	private Float price;

	public ArticleResponse() {
		super();
	}

	public ArticleResponse(String id, String nombre, Float price) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
