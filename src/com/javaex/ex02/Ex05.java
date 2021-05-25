package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이:");
		int age = sc.nextInt();  // 3

		sc.nextLine();  // 오류상황 -->개행문자 사용

		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		String name = sc.nextLine();  //황일영
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		
		sc.close();
		
	}

}
