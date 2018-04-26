package day13;

import javax.swing.JOptionPane;

public class ThreadMain {


	public static void main(String[] args) {
		
		//MyThread4_Main
		Runnable r = new MyThread4();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		th1.start();
		th2.start();


		/*		
		//MyThread3_Main
		Thread m3 = new Thread(new MyThread3());
		m3.start();
		for(int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		try {
			m3.join();
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		System.out.println("쓰레드 다시 시작");
		m3 = new Thread(new MyThread3());
		m3.start();
		try {
			m3.join();
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		System.out.println("Main 쓰레드 종료");	
		
		*/
		
		
			/*
			//MyThread2_Main
			 
			Thread m2 = new Thread(new MyThread2());
			m2.setDaemon(true);
			m2.start();
			
			for(int i = 0; i<20; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
				if(i == 9)
					data = true;
			}
			*/
		
			/*
			data = JOptionPane.showInputDialog("문자열 입력");		
			System.out.println("입력받은 문자열 : " + data);
			*/
	}	
}

class MyThread extends Thread{
	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		for(int i = 0; i<100; i++) {
				System.out.print("-");
				
		}
		
	}
}

class MyThread2 implements Runnable{
	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			//if(ThreadMain.data == true)
				System.out.println("파일을 자동저장 합니다.");
		}	
	}
}


class MyThread3 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		System.out.println("MyTread3 종료합니다.");
	}
}

class MyThread4 implements Runnable{
	Integer balance = new Integer(3000);
	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
	
		while(balance > 0) {
			synchronized(this) { //실행중일 때 다른 객체가 접근하지 못하도록 하는 기능
				if(balance >= 1000) {
					balance -= 1000;
					System.out.println(balance);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		}
	}
}

