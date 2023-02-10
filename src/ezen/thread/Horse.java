package ezen.thread;

import java.util.Random;

/**
 * 경주마
 * @Author 김재훈
 * @Date 2023. 1. 25.
 */
public class Horse extends Thread {
	// String name; 이름 부여 안 하면 Thread-0 , Thread-1 ...
	public Horse() {}
	public Horse(String name) {
		super(name); 
	}
	
	@Override
	public void run() {
		Random random = new Random();
		System.out.println(getName()+"말 스타트~~~");
		
		for(int i =1; i <= 100; i++) {
			System.out.println(getName()+"말 "+i+"미터 전진");
			try {
				Thread.sleep(random.nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName()+"말 결승점 통과~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
	
}
