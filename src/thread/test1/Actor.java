package thread.test1;

public class Actor extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println(getName() + "�Ǹ���Ա��");
		
		int count = 0;
		boolean keepRunning = true;
		while (keepRunning) {
			
			System.out.println(getName() + "��̨�ݳ�" + (++count) + "�Ρ�");
			
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
		System.out.println(getName() + "�ݳ�������");
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
        System.out.println(Thread.currentThread().getName() + "�Ǹ���Ա��");
		
		int count = 0;
		boolean keepRunning = true;
		while (keepRunning) {
			
			System.out.println(Thread.currentThread().getName() + "��̨�ݳ�" + (++count) + "�Ρ�");
			
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
		System.out.println(Thread.currentThread().getName() + "�ݳ�������");
	}
	
}
