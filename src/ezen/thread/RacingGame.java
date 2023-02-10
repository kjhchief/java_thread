package ezen.thread;

public class RacingGame {

	public static void main(String[] args) {
		System.out.println("지금부터 경주마 게임을 시작합니다.");
		System.out.println("경주마 준비");
		
		Horse horse1 = new Horse("재훈마");
		Horse horse2 = new Horse("대한마");
		Horse horse3 = new Horse("정석마");
		Horse horse4 = new Horse("찬울마");
		
		
		System.out.println("땅~~~~");
		horse1.start();
		horse2.start();
		horse3.start();
		horse4.start();
		
		// 메인스레드는 다른 스레드가 종료될 때까지 일시 정지 해야함.(밑에 게임 종료 실행되면 안 됨)
		try {
			horse1.join();
			horse2.join();
			horse3.join();
			horse4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("경주마 게임을 종료합니다.");
	}

}
