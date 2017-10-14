package thread.test2;

public class TicketsRunnableTest implements Runnable{
	
	
	private int ticketsCount = 5;
	
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		while (ticketsCount > 0) {
			ticketsCount --;  //如果还有票就卖掉一张
			System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余票数为：" + ticketsCount);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketsRunnableTest runnableTest = new TicketsRunnableTest();
		
		Thread thread1 = new Thread(runnableTest, "窗口1");
		Thread thread2 = new Thread(runnableTest, "窗口2");
		Thread thread3 = new Thread(runnableTest, "窗口3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
