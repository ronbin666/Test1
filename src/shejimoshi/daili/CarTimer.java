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
		System.out.println("汽车开始行驶。。。");
		
		moveable.run();
		
		long endttime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶时间：" + (endttime - starttime) + "毫秒。");
	}

}
