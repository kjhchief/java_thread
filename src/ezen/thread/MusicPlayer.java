package ezen.thread;

/**
 * 메인스레드(CPU)와 독립적으로 동작하는 음악재생 스레드(CPU)
 * @Author 김재훈
 * @Date 2023. 1. 25.
 */
public class MusicPlayer extends Thread {
	// String name; 이름 부여 안 하면 Thread-0 , Thread-1 ...
	public MusicPlayer() {}
	public MusicPlayer(String name) {
		super(name); 
	}
	
	
	// 사용자 정의 스레드의 엔트리 포인트(실행 진입점)
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		// 음악 재생 코드
		for (int i = 0; i < 50; i++) {
			System.out.println(thread.getName()+" : 음악재생: " + i);
		}
	}
	
	// start() {} 스레드 스케쥴러 실행 메소드. 안 보이지만 정의 되어 있음.
}
