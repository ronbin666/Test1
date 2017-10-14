package thread.test1;

/**
 * 隋唐演义大舞台
 * @author Administrator
 *
 */
public class Stage  extends Thread{

	@Override
	public void run() {
		System.out.println("欢迎观看隋唐演义！");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("大幕徐徐拉开");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("话说。。。。。。。。。。");
		
		// TODO Auto-generated method stub
		//super.run();
		//使用Runnable借口创建线程
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "隋军");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民起义军");
		
		//启动线程，让军队开始作战
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		
		//舞台线程休眠，大家专心观看军队厮杀
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			armyOfRevolt.join();  //调用一下 方便舞台线程快速结束？
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		System.out.println("正当双方激战时，半路杀出个程咬金");
		Thread mrC = new KeyPersonThread();
		mrC.setName("程咬金");
		
		System.out.println("程咬金的理想就是结束战争，让百姓安居乐业");
		
		//停止军队作战
		//停止线程的方法
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * 历史大戏留给关键任务
		 */
		mrC.start();
		//万众瞩目，所有线程等待程完成历史使命
		try {
			mrC.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("战争结束！");
		System.out.println("谢谢观看隋唐演义！");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Stage().start();
	}

}
