package shejimoshi.daili;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ͨ����ʵ��
//		Car car = new Car();
//		car.run();
		
		//ʹ�ü��ɷ�ʽʵ��
//		Moveable moveable = new Car2();
//		moveable.run();
		//Car2ͨ���̳еķ�ʽʵ�־�̬����
		
		
		//ʹ�þۺϷ�ʽʵ��
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
