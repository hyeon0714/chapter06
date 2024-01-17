package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread a=new DigitThread();
		
		a.start();//thread클래스의 오버라이딩을 불러옴으로 실행문은 start 자식 클래스의 메소드명은 run이어야한다
		
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			Thread.sleep(10000);//sleep을 통해 속도를 조절한다
		}
	}//thread를 이용하면 동시에 출력이 가능하다
	
}
