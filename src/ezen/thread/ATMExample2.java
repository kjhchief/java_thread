package ezen.thread;

public class ATMExample2 {

	public static void main(String[] args) {
		ATM atm = new ATM();

		Thread thread1 = new Thread() { // 익명 클래스
			@Override
			public void run() {
				synchronized (atm) {
					while (true) {
						atm.notify();
						atm.withdrawMoney("1111-2222", 1111, 10000, "아빠");
						try {
							atm.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}

			}
		};

		Thread thread2 = new Thread() { // 익명 클래스
			@Override
			public void run() {
				synchronized (atm) {
					while (true) {
						atm.notify();
						atm.withdrawMoney("1111-2222", 1111, 10000, "아들");
						try {
							atm.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
		};

		thread1.start();
		thread2.start();

		Object obj;

	}

}
