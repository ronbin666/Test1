package shejimoshi.daili;

import java.util.Random;

public class Car implements Moveable {

	public void run() {
		// TODO Auto-generated method stub

//		long starttime = System.currentTimeMillis();
//		System.out.println("������ʼ��ʻ������");
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ�С�����");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		long endttime = System.currentTimeMillis();
//		System.out.println("����������ʻ����ʻʱ�䣺" + (endttime - starttime) + "���롣");
	}

}
