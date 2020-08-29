package com.example.demo.entitys;

import java.sql.Date;
import java.util.Map;
import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Product {
	
	private Long productId     ;
        private String class;
	private String productName;
	private int productDiscount;
	private String productColour;
	private Float productPrice;
	private Map<Integer , String > productDiscription;
	private Long productStock;
	private Date productAddedDate;
	@Column(name="picByte",length=1000)
	private Byte[] picByte;
	private String seller;
	@ManyToOne
	private ProductCategory productCategory;
	private String productBrand;
	private Long productWarranty;
	@OneToMany(mappedBy = "product")
	private List<Specifications> specification;
	private String varient;

	
	
	
	

}
