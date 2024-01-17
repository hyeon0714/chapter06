package com.javaex.ex03;

public class DigitThreadImpl implements Runnable {
	//인터페이스를 상속받는 클래스는 끝에 Impl을 많이 사용한다(관례)
	
	@Override//Runnable인터페이스에 추상적으로 있는 메소드이다->>run()
	public void run() {
		for(int i=0; i<25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
