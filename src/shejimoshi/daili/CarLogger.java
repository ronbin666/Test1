package shejimoshi.daili;

import java.util.Random;

public class CarLogger implements Moveable {

	public CarLogger(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

	private Moveable moveable;
	
	public void run() {
		// TODO Auto-generated method stub

		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��־������");
		
		moveable.run();
		
		long endttime = System.currentTimeMillis();
		System.out.println("����������־������");
	}

}
