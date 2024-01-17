package com.javaex.ex01;

public class DigitThread extends Thread {
	
	//필드
	
	//생성자
	
	//메소드
	public void digit() {
		for(int i=0; i<101; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		for(int i=0; i<101; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
