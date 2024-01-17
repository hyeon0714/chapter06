package com.javaex.ex04;

public class DigitImpl implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<28; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
