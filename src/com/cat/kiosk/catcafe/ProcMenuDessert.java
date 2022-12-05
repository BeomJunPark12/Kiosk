package com.cat.kiosk.catcafe;

public class ProcMenuDessert {
	public void run() {
		loop_c:
			while(true) {
//				Kiosk.p4.info();
//				Kiosk.p5.info();
				
				System.out.println("[1. 마카롱 2. 티라미수 x. 이전 메뉴]");
				System.out.println();
				Kiosk.cmd = Kiosk.sc.next();
				switch(Kiosk.cmd) {
				case "1":
					System.out.println("마카롱이 선택됐습니다.");
					Product mc = new Product("마카롱", 5000);
					Kiosk.basket.add(mc);
					break;
				case "2":
					System.out.println("티라미수가 선택됐습니다.");
					Product tm = new Product("티라미수", 7000);
					Kiosk.basket.add(tm);
					break;
				case "x":
					System.out.println("이전 메뉴 이동");
					break loop_c;
					
						
					
				}
			}
	}
}
