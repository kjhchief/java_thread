package ezen.thread;

import java.awt.Dimension;
import java.awt.Toolkit;

public class RunnableExample {

	public static void main(String[] args) {
		System.out.println("메인스레드 실행됨");
		
		SomeTask task = new SomeTask();
		
		Thread thread = new Thread(task);
		thread.start();
		
		// 익명객체 활용
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Dimension dim = toolkit.getScreenSize();
				System.out.println(dim.width);
				System.out.println(dim.height);
				for (int i = 0; i < 10; i++) {
					toolkit.beep();
				}
			}
		});
		thread2.start();
		
		
		System.out.println("메인스레드 종료됨");
	}

}
