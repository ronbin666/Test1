package shejimoshi.daili;

public class Car2 extends Car {

	public void run() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ������");
		
		super.run();
		
		long endttime = System.currentTimeMillis();
		System.out.println("����������ʻ����ʻʱ�䣺" + (endttime - starttime) + "���롣");
	}
}
