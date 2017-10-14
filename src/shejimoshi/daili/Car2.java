package shejimoshi.daili;

public class Car2 extends Car {

	public void run() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		
		super.run();
		
		long endttime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶时间：" + (endttime - starttime) + "毫秒。");
	}
}
