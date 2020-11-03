package com.tts.ecommercepage.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
    private Long id;
    
    private int quantity;
    private float price;
    private String description;
    private String name;
    private String brand;
    private String catergory;
    private String img;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCatergory() {
		return catergory;
	}
	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
    }
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", catergory=" + catergory + ", description=" + description + ", id=" + id
				+ ", img=" + img + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
    
    

    

    
}
