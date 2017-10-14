package shejimoshi.daili;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//普通方法实现
//		Car car = new Car();
//		car.run();
		
		//使用集成方式实现
//		Moveable moveable = new Car2();
//		moveable.run();
		//Car2通过继承的方式实现静态代理
		
		
		//使用聚合方式实现
//		Car car = new Car();
//		Moveable moveable = new Car3(car);
//		moveable.run();
		
		
		//
		Car car = new Car();
		CarLogger carLogger = new CarLogger(car);
		CarTimer carTimer = new CarTimer(carLogger);
		carTimer.run();
	}

}
