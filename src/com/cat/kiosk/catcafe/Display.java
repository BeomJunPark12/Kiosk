package com.cat.kiosk.catcafe;

import com.cat.util.Cw;

public class Display {
	
	static String dot = "★";
	
	public static void line() {
		for(int i=0; i<20; i++) {
		Cw.w(dot);
		}
		Cw.wn("");
	}
	
	public static void title() {
//		Cw.wn("=======================");
		line();
		Cw.wn("======고양이 카페========");
//		Cw.wn("=======================");
		line();
	}
}
