package com.lti.user;

import com.lti.excel.Excel;

public class UserApp {
	
	public static void main(String[] args) {
		
		
		Excel sheet1= new Excel();
		int x=2000;
		int y=3000;
		
	//	System.out.println(sheet1.sum(x,y));
		
		int r=sheet1.sum(x,y);
		System.out.println(r);	
		
	}

}
