package com.office.ex;

public class variable {
 
	public static void main(String[] args) {
		
		// 변수
		int mynum = 1;
		int mynum2 = 2;
		float mynum3 = 3.14f;
		
		System.out.println(mynum + mynum2);
	
	/*
	 * 변수란, 메모리의 특정 공간을 뜻한다.
	 * 변수명이란, 메모리 주소 대신 인간이 붙인 이름이다
	 * 변수 정의 문법
	 * 데이터 타입 변수명 = 데이터;
	 * 
	 * 변수 정의 = 변수 선언+ 변수 초기화
	 * 변수 선언; int mynum
	 * 변수 초기화: mynum = 1
	 * = : 할당 연산자 
	 */
	
	// 변수 선언
	int num1; 
	
	//변수 초기화
	num1 = 10;
	
	//정수 : int
	//실수 : float
	//문자 : char
	//문자열 : String
	
	int score = 100;
	
	float pi = 3.14f;
	
	char a = 'a';
	
	String str = "abcdefg";
	
	// 내 이름 (홍길동)
	String myName = "홍길동";
	
	// 1학기 수학 점수(85)
	int myScore = 85;
	
	// 나의 신장 (1.88)
	float myHeiaht = 1.88f;
	
	// 내가 제일 좋아하는 알파벳 (J)
	char myfavorityAlphabet = 'J';
	
			
	
	int addr = System.identityHashCode(num1);
	System.out.println("addr:"+addr);
	
	/*
	 * 변수 이름 작명
	 */
	// 1. 변수명의 시작은 일반적으로 소문자를 사용한다.
	int money = 1000;
	// int Money = 1000; (x)
	
	// 2. 변수명은 일반적으로 영문자를 사용한다.
	int myMoney = 500;
	// int 나의돈 = 500; (x)
	
	// 3. 변수명은 데이터의 의미를 쉽게 파악 할 수 있도록 작명한다.(*****)
	int Score = 100;
	// int s= 100; (x)
	
	String player = "son";
	String p = "park";
	
	
	// 4. 2개 이상의 단어가 조합된 경우 낙타표기법을 사용한다.(*****)
	int myCurrentLocation;
	//int my_current_location; 스네이크표기법: 주로 C언어나 파이썬에서 사용
	
	
	int currentLocation;
	// int current_Location; 스네이크 표기법 
	// int current-Location; 케밥 표기법 
	
	int totalScore;
	int highScore;
	int maxScore;
	String newItem;
	
	// 5. 키워드(==예약어)는 변수 명으로 사용 할 수 없다.
	// int public = 100; 
	
	// 6. '_'or '$'를 제외한 특수문자 사용 금지
	//int score!;
	//int score^^;
	//int score@;
	int sco__________re;
	int sco$$$$$$r___$$e;
	
	//__init__
	
	
	// 7. 변수명에는 공백문자는 사용할 수 없다.
	//int my           score;
	
	
	// 8. 변수명에 숫자를 사용하는 경우 첫 글자를 제외한 나머지 글자에 사용 할 수 있다.
	int sco7re;
	int score7;
	//int 7score;
	
	/*
	  - 변수명은 영문으로 하고, 첫글자는 소문자로 한다.
	  - 2개 이상의 단어가 조합된 경우 낙타표기법을 따른다.
	  - 특수문자, 예약어 그리고 공백문자는 사용하지 않는다.
	  - 숫자를 사용해야하는 경우 중간 또는 뒤에 사용한다.
	 */
	
	/*
	 * 변수데이터 변경
	 */
	int myNum = 10;
	System.out.println("myNum:"+ myNum); // 10
	
	myNum = 20;
	
	int yourNum = myNum;// 20 - - > 데이터 복사(copy)
	System.out.println("myNum:"+ myNum); //20 
	System.out.println("yourNum:" + yourNum); //20
	
	yourNum = 200; 
	System.out.println("myNum:"+ myNum); //20 
	System.out.println("yourNum:" + yourNum); //200

	//python
	//기초 데이터 타입 (깊은복사)
	//참조 데이터 타입 (껍데기만 복사 한다고 해서 얕은복사라고 한다)
	
	// 데이터 스왑 (swap)
	int n1 = 10;
	int n2 = 20;
	
	/*
	 * n1: 20
	 * n2: 10
	 */
	
	
	n1 = n1 + n2; // 30
	n2 = n1 - n2; // 10
	n1 = n1 - n2; // 20
	
	System.out.println("n1: "+ n1);
	System.out.println("n2: "+ n2);
	
	n1 = 10;
	n2 = 20;
	
	int temp = n1;
	n1 = n2; // 20
	n2 = temp; // 10
	
	System.out.println("n1: "+ n1);
	System.out.println("n2: "+ n2);
	
			

   }
}