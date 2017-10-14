package shejimoshi.daili;

import java.util.Random;

public class CarTimer implements Moveable {

	public CarTimer(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

	private Moveable moveable;
	
	public void run() {
		// TODO Auto-generated method stub

		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ������");
		
		moveable.run();
		
		long endttime = System.currentTimeMillis();
		System.out.println("����������ʻ����ʻʱ�䣺" + (endttime - starttime) + "���롣");
	}

}
