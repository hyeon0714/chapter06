package com.javaex.ex03;

public class Ex01 {
	
	public static void main(String[] args) {
		
		/*
		DigitThreadImpl b=new DigitThreadImpl();
		Thread t=new Thread(b);
		t.start();
		*/
		//계속 연습한 방식
		
		
		Thread a=new Thread(new DigitThreadImpl());
		
		a.start();
		//Thread에 인터페이스 Runnable 인터페이스가 들어간 생성자가 있어서 바로 사용가능하다
		
		
		
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
