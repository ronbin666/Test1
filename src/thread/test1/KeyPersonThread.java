package thread.test1;

public class KeyPersonThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println(Thread.currentThread().getName() + "开始战斗!");
		for (int i = 0; i < 10 ; i ++) {
			System.out.println(Thread.currentThread().getName() + "左右击杀。。。");
		}
		System.out.println(Thread.currentThread().getName() + "战斗结束！");
	}
}
