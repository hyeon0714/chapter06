package com.javaex.ex04;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Thread a=new Thread(new DigitImpl());
		Thread b=new Thread(new LowerImpl());
		Thread c=new Thread(new UpperImpl());
		
		a.start();
		b.start();
		c.start();
	}
}
