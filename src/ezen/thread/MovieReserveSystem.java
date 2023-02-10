package ezen.thread;

public class MovieReserveSystem {
	/** 멀티스레드에 의해 공유되는 클래스 */
	private boolean[] tickets; // 좌석 예매 했나 안 했나.

	public MovieReserveSystem() {
		this(10);
	}

	public MovieReserveSystem(int count) {
		tickets = new boolean[count];
	}

	public /* synchronized */ boolean reserve(Member member) { // 동기화 메소드. 한 스레드씩 작업하기 위해 잠그기.
		System.out.println("----- reserve() Method Start -----");
		System.out.println(member.getUserName() + "님 예약 신청!!!");
		// 데이터베이스 서버를 체크 한다는 의미로 1초 동안 대기
		try {
			System.out.println(member.getUserName() + "님 예약 진행중 >>>>>");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 특정 영역만 동기화 처리
		synchronized (tickets) {
			for (int i = 0; i < tickets.length; i++) {
				// 예약되어 있지 않았으면
				if (!tickets[i]) {
					// 예약으로 변경
					tickets[i] = true;
					System.out.println(member.getUserName() + "님 " + (i + 1) + "번 좌석 예약 완료 >>>>>");
					return tickets[i];
				}
			}
		}

		System.out.println("----- reserve() Method End -----");
		// 좌석이 없으면
		return false;
	}
}
