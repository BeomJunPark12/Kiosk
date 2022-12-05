package com.cat.kiosk.catcafe;

import java.util.ArrayList;
import java.util.Scanner;



public class Kiosk {
	ProcMenuDrink procmenudrink = new ProcMenuDrink();
	ProcMenuDessert procmenudessert = new ProcMenuDessert();
	
	public static ArrayList<Product> basket = new ArrayList<>();
	
	public static Product p1 = new Product("아아", 2000);
	public static Product p2 = new Product("뜨아", 1500);
	public static Product p3 = new Product("오렌지 쥬스", 3000);
	public static Product p4 = new Product("마카롱", 5000);
	public static Product p5 = new Product("티라미수", 7000);
	
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	

	void run() {
			
		Display.title();
		
		loop_a:
		while(true) {
			System.out.println("[1.음료 2.디저트]");
			System.out.println();
			cmd = sc.next();
			switch(cmd) {
			case "1":
				System.out.println("=================================");
				System.out.println("==============음료 리스트===========");
				System.out.println("=================================");
				p1.info();
				p2.info();
				p3.info();
				procmenudrink.run();
				break;
			case "2":
				System.out.println("=================================");
				System.out.println("============디저트 리스트===========");
				System.out.println("=================================");
				p4.info();
				p5.info();
				procmenudessert.run();
				break;
			case "x":
				break loop_a;
			}
		}
		System.out.println("프로그램 종료");
		
		// 상품 개수 처리
		int count = 0;
		count = count + basket.size();
		System.out.println("총 상품 개수: " + count);
		
		// 총 금액
		int sum = 0;
		for(int i=0; i<basket.size(); i++) {
			sum = sum + basket.get(i).price;
		}
		System.out.println("총 금액: " + sum);
	}
}

