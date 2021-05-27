package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int dan;
		
		int i = 1;  //초기화
		
		System.out.print("단: ");
		dan = sc.nextInt();
		
		while(i<=9) { //반복조건
			
			int result = dan * i;
			System.out.println(dan + "*" + i + "=" + result );
			
			//증감식
			i++;
		}
		
		sc.close();

		
		
		
		
		
	}

}
