package com.xworkz.map.boot;

public class ProductDTO {
	
 String name;
 int price;
 int id;
 boolean quantity;
 String mfgDate;
public String getName() {
	return name;
}
public int getPrice() {
	return price;
}
public int getId() {
	return id;
}
public boolean isQuantity() {
	return quantity;
}
public String getMfgDate() {
	return mfgDate;
}
public void setName(String name) {
	this.name = name;
}
public void setPrice(int price) {
	this.price = price;
}
public void setId(int id) {
	this.id = id;
}
public void setQuantity(boolean quantity) {
	this.quantity = quantity;
}
public void setMfgDate(String mfgDate) {
	this.mfgDate = mfgDate;
}
@Override
public String toString() {
	return "ProductDTO [name=" + name + ", price=" + price + ", id=" + id + ", quantity=" + quantity + ", mfgDate="
			+ mfgDate + "]";
}
public ProductDTO(String name, int price, int id, String string, String mfgDate) {
	super();
	this.name = name;
	this.price = price;
	this.id = id;
	this.quantity = string;
	this.mfgDate = mfgDate;
}
public ProductDTO() {
	super();
	
}

		

	}


