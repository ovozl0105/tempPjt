package com.office.ex;

public class datatype {
	public static void main(String[] args) {
		
		/*
		 * 데이터 타입(Data type)이란,
		 * 메모리에 데이터가 저장될 때 데이터에 따라서 할당 받는 메모리 크기가
		 * 다르게 되는데요, 예를 들어 정수는 1~8byte, 실수는 4~8byte의 크기가 
		 * 할당 됩니다. 이런것을 데이터 타입이라고 합니다.
		 */
		
		// 1. 정수 데이터 타입
		// 1-1, byte 	1byte -128 ~ 127
		byte byteVar = 127;
		System.out.println("byteBar : " + byteVar); //127
		// byteVar = 128;
		// byteVar = -129;
		
		// 1-2. short 2byte -32,768 ~ 32,767 
		short shortVar = 32767;
		System.out.println("shortVar:" + shortVar);
		// shortVar = 32768;
		
		// 1-3, int 4byte -2,147,483,648 ~ 2,147,483,647
		int intVar = 2147483647;
		System.out.println("intVar: " + intVar);
		// intVar = 2147483648;
		
		// 1-4, long 8byte -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long longVar = 9223372036854775807L;
		System.out.println("longVar: " + longVar);
		 
		/*
		 * 2. 실수형 데이터 타입
		 */
		// 2-1, float  4byte
		float floatVar = 3.14f;
		System.out.println("floatVar: " + floatVar);
		
		// 2-2, double 8byte
		double doubleVar = 3.141592;
		System.out.println("doubleVar: " + doubleVar);
		
		floatVar = 3.12345678901234567890f;
		System.out.println("floatVar: " + floatVar);
		
		doubleVar = 3.12345678901234567890;
		System.out.println("doubleVar: " + doubleVar);
		
		/*
		 * 3. 논리형(boolean)	1byte	참(true) 또는 거짓(false)
		 */
		boolean booleanVar = true;
		System.out.println("booleanVar: " + booleanVar); //true
		
		booleanVar = false; 
		System.out.println("booleanVar: " + booleanVar); //false
		
		boolean isMember = true;
		isMember = false;
		
		/*
		 * 4. 문자 데이터 타입
		 * char		2byte
		 */
		char charVar = 'A';
		System.out.println("charVar : " + charVar); // A
		// charVar = '1'; // ' ' " "
		// charVar = 'A"; X 
		
		// 참고
		// 빈(empty) 문자, 공백(space) 문자
		// '' - - > 빈(empty) 문자
		// ' ' --> 공백(space) 문자
		
		//char ch1 = ''; 빈문자라서 오류 뜸
		char ch2 = ' ';
		//char ch3 = '  '; 문자열이라서 오류 뜸
		
		//유니코드란?
		//세상의 모든 문자를 숫자로 표현 한 것
		//문자가 메모리에 저장 될 때 문자 자체로 저장되는 것이 아니고 유니코드로 저장된다.
		 
		char char1 = 'A'; 
		System.out.println("char1 : " + char1);  // A
		
		int unicode1 = char1;
		System.out.println("unicode1:" + unicode1); //65
		
		char char2 = 65;
		System.out.println("char2 : " + char2); // A
		
		char char3 = 12593; // ㄱ
		System.out.println("char3 : " + char3);
		
		/*
		 * char char2 = 'A'; -> 65 -> 0100 0001 -> 실행 
		 * char char2 = 65;  ->0100 0001 -> 실행
		 */
		
		/* 
		 * 5. 문자열 String
		 */
		
		String str1 = "Hello";
		System.out.println("str1:" + str1);
		str1 = "";
		str1 = " ";
		str1 = "A";
		// str1 = 'A';
		
	}
}
