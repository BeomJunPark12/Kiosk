package com.cat.kiosk.catcafe;

public class ProcMenuDrink {
	public void run() {
		loop_b:while(true) {
			//메뉴출력
//			Kiosk.p1.info();
//			Kiosk.p2.info();
//			Kiosk.p3.info();
			
			
			System.out.println("[1.아아 2.뜨아 3.오렌지 쥬스 x이전 메뉴]");
			System.out.println("");
			Kiosk.cmd = Kiosk.sc.next();
			switch(Kiosk.cmd) {
			case "1":
				System.out.println("아아가 선택됐습니다.");
				
				Product ice = new Product("아아",2000);
				Kiosk.basket.add(ice);
				
				break;
			case "2":
				System.out.println("뜨아가 선택됐습니다.");
				Product hot = new Product("뜨아", 1500);
				Kiosk.basket.add(hot);
				break;
			case "3":
				System.out.println("오렌지 쥬스가 선택됐습니다.");
				Product orange = new Product("오렌지 쥬스", 3000);
				Kiosk.basket.add(orange);
				break;
				
			case "x":
				System.out.println("이전 메뉴 이동");
				break loop_b;
			}
		}
	}
}
