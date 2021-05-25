package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {

		//논리 연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&&연산자 =================");
		System.out.println( true && true);
		System.out.println( true && false);
		System.out.println( false && true);
		System.out.println( false && false);
		
		//논리 연산자 기본 ||
		System.out.println("||연산자 =================");
		System.out.println( true || true); 
		System.out.println( true || false);
		System.out.println( false || true);
		System.out.println( false || false);
		
		
		//논리 연산자 응용
		System.out.println("논리 연산자 응용=================");
		System.out.println( (a>b)&&(a<b) );  // (5>7)-->false   (5<7)-->true    false&&true --> false
		System.out.println( (a>b)&&(a>b) );  // (5>7)-->false   (5>7)-->false   false&&false --> false
		System.out.println( (a>b)||(a<b) );  // (5>7)-->false   (5<7)-->true    false||true  --> true
		System.out.println( (a>b)||(a<b)&&(a<b) );  // 5>7-->false  5<7-->true  false||true-->true   5<7-->true   true&&true -->true
		System.out.println( (a>b)&&(a<b)||(a<b) );  // 5>7-->false  5<7-->true  false&&true-->false  5<7-->true   false&&true --> true
		
		System.out.println( (a>b)&&(a<b)&&(a<b) );   //(5>7)-->false   (5<7)-->true  (5<7)-->true    false && true --> false    false && (5<7-->계산하지 않는다)
		                                             //if문 할때 설명 -->  모두 true 여야 true다 --> 모두 만족해야 한다
		
		System.out.println("논리 연산자 !=================");
		System.out.println((a<b)); // 5<7 -->true
		System.out.println( (a>b)&&(a>b) );    // false && false  --> false
		System.out.println( !(   (a>b)&&(a>b)    ) );        //       !(false) --> true
		
		
		System.out.println( (a>b)&&!(a>b) );    // false && (! fasle)  --> false && (true) -->  false
		System.out.println( !(a>b)&&!(a>b) );   // !false && !false  --> true && true --> true
		
	}

}
