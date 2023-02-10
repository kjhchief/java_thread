package ezen.thread;

/**
 * JVM(Process)은 내부적으로 main 이라는 이름의 스레드를 생성하고, main 쓰레드는 main() 메소드를 실행한다.
 * @Author 김재훈
 * @Date 2023. 1. 25.
 */
public class MainThreadExample {
	
	// main 스레드에 의해 최초 실행되는 엔트리 포인트. 
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		
		System.out.println(mainThread.getName() +"스레드에 의해 프로그램 시작됨");
		
		int x = 10;
		for(int i=0; i<100; i++) {
			System.out.println(mainThread.getName() +"스레드에서 "+ i +"출력");
			
			if(i == 50) {
//				System.out.println("음악재생~~~");
				// 사용자 정의 스레드 생성 및 실행
				MusicPlayer musicPlayer = new MusicPlayer();
//				musicPlayer.run();
				// 스레드 시작!
				musicPlayer.start();
			}
			
		}
		
		System.out.println(mainThread+"스레드 종료됨");
	}
}
