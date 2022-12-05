package com.cat.kiosk.catcafe;

public class Product {
	String name;
	int price;
	
	Product(){}
	// 생성자함수 - 매개변수 2개짜리
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("상품명: " + name +" 가격: " + price + "원");
	}
	
	
}
