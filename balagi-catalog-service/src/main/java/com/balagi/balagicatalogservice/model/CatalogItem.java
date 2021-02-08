package com.balagi.balagicatalogservice.model;

import lombok.Data;

@Data
public class CatalogItem {
	
	private String name;
	private String desc;
	private String rating;

	public CatalogItem(String name, String desc, String rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}

	public CatalogItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}