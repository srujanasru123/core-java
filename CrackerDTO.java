package com.xworkz.crackers.dto;

import com.xworkz.crackers.constants.Color;
import com.xworkz.crackers.constants.CrackerType;

public class CrackerDTO {
private String name;
private CrackerType type;
private Color color;
private double price;

public CrackerDTO(CrackerType type) {
this.type=type;


}
@Override
public String toString() {
	return "CrackerDTO [name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + "]";
}
public void setName(String name) {
	this.name = name;
}
public void setPrice(double price) {
	this.price = price;
}
}
