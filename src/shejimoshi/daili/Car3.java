package shejimoshi.daili;

public class Car3 implements Moveable {

	public Car3(Car car) {
		super();
		this.car = car;
	}

	//�ۺϣ�  һ�����е�������һ������
	private Car car;
	
	public void run() {
		// TODO Auto-generated method stub

		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ������");
		
		car.run();
		
		long endttime = System.currentTimeMillis();
		System.out.println("����������ʻ����ʻʱ�䣺" + (endttime - starttime) + "���롣");
	}

}
