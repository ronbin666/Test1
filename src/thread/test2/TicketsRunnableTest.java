package thread.test2;

public class TicketsRunnableTest implements Runnable{
	
	
	private int ticketsCount = 5;
	
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		while (ticketsCount > 0) {
			ticketsCount --;  //�������Ʊ������һ��
			System.out.println(Thread.currentThread().getName() + "����һ��Ʊ��ʣ��Ʊ��Ϊ��" + ticketsCount);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketsRunnableTest runnableTest = new TicketsRunnableTest();
		
		Thread thread1 = new Thread(runnableTest, "����1");
		Thread thread2 = new Thread(runnableTest, "����2");
		Thread thread3 = new Thread(runnableTest, "����3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
