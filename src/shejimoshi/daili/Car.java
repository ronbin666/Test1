package shejimoshi.daili;

import java.util.Random;

public class Car implements Moveable {

	public void run() {
		// TODO Auto-generated method stub

//		long starttime = System.currentTimeMillis();
//		System.out.println("汽车开始行驶。。。");
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中。。。");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		long endttime = System.currentTimeMillis();
//		System.out.println("汽车结束行驶，行驶时间：" + (endttime - starttime) + "毫秒。");
	}

}
