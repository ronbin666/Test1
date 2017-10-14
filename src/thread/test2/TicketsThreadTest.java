package thread.test2;

import java.util.Scanner;

public class TicketsThreadTest extends Thread{
	
	private int ticketsCount = 5;
	private String name;  //窗口，也就是线程名字
	
	//char sex;
	//Scanner input = new Scanner(System.in);
	//sex = input.nextLine().charAt(0);
	//System.out.println(sex);
	//成员变量赋初值必须与成员变量的声明写在同一条语句里，因为类的内部不允许直接出现执行语句。
	
	public TicketsThreadTest(final String sname) {
		this.name = sname;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		while (ticketsCount > 0) {
			ticketsCount --;  //如果还有票就卖掉一张
			System.out.println(name + "卖了一张票，剩余票数为：" + ticketsCount);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建三个线程模拟三个窗口卖票
		TicketsThreadTest test1 = new TicketsThreadTest("窗口1");
		TicketsThreadTest test2 = new TicketsThreadTest("窗口2");
		TicketsThreadTest test3 = new TicketsThreadTest("窗口3");
		
		test1.start();
		test2.start();
		test3.start();
		
	}

}
