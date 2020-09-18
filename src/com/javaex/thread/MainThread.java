package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		//	쓰레드 불러와 실행
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		
		Thread thread2 = new Thread(new AlphabetThread());
		thread2.start();
		
		
		//	서브 쓰레드의 제어를 위해서
		//	서브 쓰레드의 흐름을 메인스레드에 연결
		
		try {
			thread.join();
			thread2.join();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MainThread 종료");
		//	쓰레드 시작
//		thread.run();
		thread.start();	//	start 메서드 내부에서 run 메서드를 호출
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("[MainTread]:" + ch);
			
			//	잠시대기 
			try{
			Thread.sleep(300);	//	0.3초 지연
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
	}
}