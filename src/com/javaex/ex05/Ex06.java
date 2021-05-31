package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		
		intArray[0] = 11;
		intArray[1] = 3;
		//intArray[2] = 78;     //값을 넣지 않은경우 정수형-->0 으로 표기된다.
		                        //실수형, boolean, char 기본값 알아볼것
		
		System.out.println("==================");
		System.out.println(intArray.length);
		System.out.println("==================");
		
	
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("==================");
		
		//ArrayIndexOutOfBoundsException --> 없는 방을 사용할려고 할때
		for(int i=0; i<=intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
