package thread.test1;

public class KeyPersonThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println(Thread.currentThread().getName() + "��ʼս��!");
		for (int i = 0; i < 10 ; i ++) {
			System.out.println(Thread.currentThread().getName() + "���һ�ɱ������");
		}
		System.out.println(Thread.currentThread().getName() + "ս��������");
	}
}
