package ezen.thread;

public class ATMExample {

	public static void main(String[] args) {
		ATM atm = new ATM();

		Thread thread1 = new Thread() { // 익명 클래스
			@Override
			public void run() {
				while (true) {
					atm.withdrawMoney("1111-2222", 1111, 10000, "아빠");
				}
			}
		};

		Thread thread2 = new Thread() { // 익명 클래스
			@Override
			public void run() {
				while (true) {
					atm.withdrawMoney("1111-2222", 1111, 10000, "아들");
				}
			}
		};
		
		thread1.start();
		thread2.start();
		
		Object obj;

	}

}
