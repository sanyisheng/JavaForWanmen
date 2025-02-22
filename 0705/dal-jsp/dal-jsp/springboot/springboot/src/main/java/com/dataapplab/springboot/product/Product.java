package com.dataapplab.springboot.product;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;

public class Product {

	public Product(int id, String name, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	private int id;
	private String sku;
	private String name;
	private String description;
	private String imageUrl;
	private boolean disabled;
	private Date createdOn = new Date();
	private BigDecimal price = new BigDecimal("0.0");
    private Category category;
    
    @JsonView(ProductView.WithoutPriceView.class)
	public int getId() {
		return id;
	}

	public String getSku() {
		return sku;
	}

    @JsonView(ProductView.WithoutPriceView.class)
	public String getName() {
		return name;
	}

    public String getDescription() {
		return description;
	}
	
    public String getImageUrl() {
		return imageUrl;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	
    @JsonView(ProductView.WithPriceView.class)	
	public BigDecimal getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
   
}