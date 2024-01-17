package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Thread a=new DigitThread();
		Thread b=new LowerThread();
		Thread c=new UpperThread();
		
		a.start();
		b.start();
		c.start();//thread를 통해 동시에 진행
		
		//a.run();
		//b.run();
		//c.run();//하나씩 실행된다
	}
}
