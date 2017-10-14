package thread.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VolateDemo {
	
	private int number = 0;
	
	private Lock lock = new ReentrantLock();
	
	public int getNumber() {
		return this.number;
	}
	
	public void increase() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//synchronized (this) {
		//	this.number++;
		//}
		lock.lock();
		try {
			this.number++;
		} finally {
			lock.unlock();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final VolateDemo demo = new VolateDemo();
		for(int i=0;i<500;i++) {
			new Thread(new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					demo.increase();
				}
			}).start();
		}
		//����������߳������У����߳̾��ó�cpu��Դ��
		//ֱ�����е����̶߳��������ˣ����߳��ټ�������ִ��
		while (Thread.activeCount() > 1) {
			Thread.yield();
		}
		System.out.println("number: " + demo.number);
	}

}
