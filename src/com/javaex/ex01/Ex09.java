package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//관계 연산자 --> 결과는 true 또는 false --> 결과는 boolean 형이다
		int n01 = 5;
		int n02 = 3;
		int n03 = 5;
		
		System.out.println(n01<n02);  // 5<3-->false
		System.out.println(n01>n02);  // 5>3-->true
		System.out.println(n01<=n02); // 5<=3-->false
		System.out.println(n01<=n03); // 5<=5-->true
		System.out.println(n01>=n02); // 5>=3-->true 
		System.out.println(n01>=n03); // 5>=5-->true
		
		System.out.println(n01 == n02); // 5==3-->false
		//System.out.println(n01=n02);  // n01 에 3을 대입 
		
		System.out.println(n01 != n02); // 5 != 3  --> 5, 3 같지않니(다르니)?  --> true
		
	}

}
