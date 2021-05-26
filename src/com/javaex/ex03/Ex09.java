package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("A.자바    B.C    C.C++    D.파이썬");
		System.out.print("과목번호: ");
		
		String code = sc.nextLine(); 
		//기본자료형(8) == 비교가능
		//String == 비교사용할수 없음
		
		if( code == "A" ) {
			System.out.println("R101호");
		}else if( code == "B" ){
			System.out.println("R202호");
		}else if( code == "C" ){
			System.out.println("R303호");
		}else if( code == "D" ){
			System.out.println("R404호");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		
		
		
		
		sc.close();
		
	}

}
