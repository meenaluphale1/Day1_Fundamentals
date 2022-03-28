package com.lti.statements;

public class Constructs {


public void findAnswer(boolean check) {
		 int answer;
		 int onlyOneBranch;
		 if (check) {
		 onlyOneBranch = 1;
		 answer = 1;
		 } else {
		 answer = 2;
		 }
		 System.out.println(answer);
		 //System.out.println(onlyOneBranch); 
		}
		
	
	public static void main(String[] args) {

		int dayOfWeek =6;
final byte saturday = 6;
switch(dayOfWeek) {
default:
System.out.print("Another Weekday");
break;
case saturday:
System.out.print("Weekend!");
}


		
		
	/*	for(int i=1; i<=5;i++)	
		{	
			System.out.println(i);	
		if(i==3)
			continue ; 	
		
		}	
*/
		
		
		
		
		
	/*	for (int i = 0;  ; i++) {
			System.out.println("hello");
			}
			//System.out.println("hi");*/

/*
		boolean ans=true;
		////line 2 // should not be a declarative statement  ,,,u declared x =0 
		
		if (100>200)  //line 1
		{
			int x=0;   
			System.out.println(x);
		}
		else
		{
			int y=10 ; //line 3
		}*/
		
		
		/*
		int x=5;
		if (x==10)
		{
		System.out.println( " x is not 5 ");
		System.out.println("inside if");
		}
		else
		{
		System.out.println("x is 5 ");
		System.out.println(" inside else");
		}
		*/
	}

}
