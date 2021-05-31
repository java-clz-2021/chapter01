package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		//방갯수 변경될때 for문에서 개수 부분을 변경해줘야 함
		
		int[] no = new int[8];    //갯수  6-->8
		
		//수동으로 해야된다.(운이좋아서 쓸수 있는 상황)
		for(int i=0; i<no.length; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}

		System.out.println(no.length);
		System.out.println("=====================");
		
		for(int i=0; i<no.length; i++) {   // 1<6     1<=6   6번방은 없다-->예외발생
			System.out.println(no[i]);
		}
		
		System.out.println("=====================");
		
		for(int i=0; i<no.length; i++) {   // 1<6     1<=6   6번방은 없다-->예외발생
			System.out.println(no[i]);
		}

	}

}
