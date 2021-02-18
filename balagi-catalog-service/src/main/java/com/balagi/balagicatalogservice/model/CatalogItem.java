package com.balagi.balagicatalogservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogItem implements Serializable{
	
	private static final long serialVersionUID = 6947988820912290894L;
	
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
	}
	
}