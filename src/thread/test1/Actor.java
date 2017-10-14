package thread.test1;

public class Actor extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println(getName() + "是个演员！");
		
		int count = 0;
		boolean keepRunning = true;
		while (keepRunning) {
			
			System.out.println(getName() + "登台演出" + (++count) + "次。");
			
			if (count == 100) {
				keepRunning = false;
			}
			
			if (count%10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName() + "演出结束。");
	}
	
	public static void main(String[] args) {
		Actor actor = new Actor();
		actor.setName("Mr.Thread");
		actor.start();
		
		Actress actress =  new Actress();
		Thread thread = new Thread(actress, "Ms.Runnable");
		thread.start();
	}
}

class Actress implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName() + "是个演员！");
		
		int count = 0;
		boolean keepRunning = true;
		while (keepRunning) {
			
			System.out.println(Thread.currentThread().getName() + "登台演出" + (++count) + "次。");
			
			if (count == 100) {
				keepRunning = false;
			}
			
			if (count%10 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + "演出结束。");
	}
	
}
