package ezen.thread;

class SomeThread extends Thread{
	
	private boolean running;
	
	public SomeThread() {
		this(false);
	}
	public SomeThread(boolean running) {
		this.running = running;
	}
	
	
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}



	@Override
	public void run() {
//		running = true;
		while (running) {
			System.out.println("음악 재생~~~~~~~~~~");
		}
		System.out.println("쓰레드에서 사용중이던 리소스 해제");
	}
}

public class ThreadStopExample {

	public static void main(String[] args) {
		System.out.println("메인스레드 실행");
		
		SomeThread thread = new SomeThread();
		thread.start();
		
		// 쓰레드 종료
		// thread.stop();
		
		thread.setRunning(false);
		
		System.out.println("메인스레드 종료");
	}

}
