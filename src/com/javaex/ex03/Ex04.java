package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int sum;

		// 조건문 연습문제- 1
		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간:");

		int time = sc.nextInt();
		
		if (time <= 8) {
			sum = time * 10000;
			System.out.println(sum);
		} else if (time > 8) {
			sum = 8 * 10000 + (time - 8) * 12000;
			System.out.println(sum);
		}

		sc.close();

	}

}
