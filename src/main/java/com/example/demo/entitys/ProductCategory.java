package com.example.demo.entitys;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Product_Category")
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryid;
	private String categoryname;
	private String categorydiscription;
	@OneToMany(mappedBy ="productCategory")
	private List<ProductCategory> product;

	public ProductCategory() {}

	public ProductCategory(String categoryname, String categorydiscription) {
		super();
		this.categoryname = categoryname;
		this.categorydiscription = categorydiscription;
	}

	public long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getCategorydiscription() {
		return categorydiscription;
	}

	public void setCategorydiscription(String categorydiscription) {
		this.categorydiscription = categorydiscription;
	}
	
	
}
