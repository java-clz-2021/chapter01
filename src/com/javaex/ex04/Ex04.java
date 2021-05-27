package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
	
		/*
		int sum  = 1 + 2 + 3 + 4 ;
		System.out.println(sum);
		*/
		
	
		int sum = 0;
		
		for(int i=1 ; i<=10; i++) {
			
			//이전까지의 합
			System.out.println(sum);
			sum = sum + i;
			
			//이번횟수까지의 합
			System.out.println(i+ "까지의 합 sum: " + sum);
			
		}
		
		
		

	}

}
