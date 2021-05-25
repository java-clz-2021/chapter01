package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		System.out.println("대입연산자------------------");
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		//산술연산자
		System.out.println("산술연산자------------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //몫
		System.out.println(a%b); //나머지
		
		//산술연산자 / %
		System.out.println("산술연산자 /  % 자세히------------------");
		System.out.println(7.0 / 2.0);
		System.out.println(7.0 % 2.0);
		
		//부호연산자
		System.out.println("부호연산자------------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		var =-var;
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println(var);
		
		
		//증감연산자
		System.out.println("증감연산자 앞------------------");
		System.out.println(a);  // a-->7
		System.out.println(++a);
		System.out.println(a); //a의 값은 변했을까?  --> 변했다

		System.out.println(b);  // b-->2
		System.out.println(--b);  
		System.out.println(b); //b의 값은 변했을까?  --> 변했다
		
		
		System.out.println("증감연산자 뒤------------------");
		System.out.println(a);   //a-->8
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b);   //b-->1 
		System.out.println(b--); //출력(1)   1-->0
		System.out.println(b);
		
		
		System.out.println("증감연산자 연습문제------------------");
		int num = 5;
		System.out.println(num);  // num-->5
		
		/*
		System.out.println(++num);  // num: 5-->6,  출력		
		*/
		
		/*
		System.out.println(num++);  // 출력, num: 5-->6
		System.out.println(num);
		*/
		
		System.out.println(num++ *10-7); //num*10, -7,  출력,   num 5-->6
		System.out.println(num); 
		System.out.println(num*10); 
		
	}

}
