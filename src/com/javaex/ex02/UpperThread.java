package com.javaex.ex02;

public class UpperThread extends Thread{
	
	public void run() {
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(2002);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
