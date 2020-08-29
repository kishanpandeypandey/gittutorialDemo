package com.example.demo.entitys;

import javax.persistence.ManyToOne;

public class Specifications {
	
	private Long specificationsId;
	@ManyToOne
	private Product product;
	private String modelNumber;
	private String modelname;
	private String simType;
	private String touchScreen;
	private Float diplaySize;
	private String operatingSystem;
	private String storage;
	
	

}
