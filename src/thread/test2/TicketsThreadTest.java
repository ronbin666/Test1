package thread.test2;

import java.util.Scanner;

public class TicketsThreadTest extends Thread{
	
	private int ticketsCount = 5;
	private String name;  //���ڣ�Ҳ�����߳�����
	
	//char sex;
	//Scanner input = new Scanner(System.in);
	//sex = input.nextLine().charAt(0);
	//System.out.println(sex);
	//��Ա��������ֵ�������Ա����������д��ͬһ��������Ϊ����ڲ�������ֱ�ӳ���ִ����䡣
	
	public TicketsThreadTest(final String sname) {
		this.name = sname;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		while (ticketsCount > 0) {
			ticketsCount --;  //�������Ʊ������һ��
			System.out.println(name + "����һ��Ʊ��ʣ��Ʊ��Ϊ��" + ticketsCount);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���������߳�ģ������������Ʊ
		TicketsThreadTest test1 = new TicketsThreadTest("����1");
		TicketsThreadTest test2 = new TicketsThreadTest("����2");
		TicketsThreadTest test3 = new TicketsThreadTest("����3");
		
		test1.start();
		test2.start();
		test3.start();
		
	}

}
