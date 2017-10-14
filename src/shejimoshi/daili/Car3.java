package shejimoshi.daili;

public class Car3 implements Moveable {

	public Car3(Car car) {
		super();
		this.car = car;
	}

	//聚合：  一个类中调用另外一个对象
	private Car car;
	
	public void run() {
		// TODO Auto-generated method stub

		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		
		car.run();
		
		long endttime = System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶时间：" + (endttime - starttime) + "毫秒。");
	}

}
