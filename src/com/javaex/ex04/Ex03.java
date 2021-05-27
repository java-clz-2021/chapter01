package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan;
		
		System.out.print("단:");
		dan = sc.nextInt();
		
		for( int i=1; i<=9 ; i++ ) {
			int result = dan*i;
			System.out.println(dan + "*" + i + "=" + result );
		}
		
		
		sc.close();
		

	}

}
