package thread.test1;

/**
 * �����������̨
 * @author Administrator
 *
 */
public class Stage  extends Thread{

	@Override
	public void run() {
		System.out.println("��ӭ�ۿ��������壡");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("��Ļ��������");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("��˵��������������������");
		
		// TODO Auto-generated method stub
		//super.run();
		//ʹ��Runnable��ڴ����߳�
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "���");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "ũ�������");
		
		//�����̣߳��þ��ӿ�ʼ��ս
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		
		//��̨�߳����ߣ����ר�Ĺۿ�������ɱ
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			armyOfRevolt.join();  //����һ�� ������̨�߳̿��ٽ�����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		System.out.println("����˫����սʱ����·ɱ������ҧ��");
		Thread mrC = new KeyPersonThread();
		mrC.setName("��ҧ��");
		
		System.out.println("��ҧ���������ǽ���ս�����ð��հ�����ҵ");
		
		//ֹͣ������ս
		//ֹͣ�̵߳ķ���
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * ��ʷ��Ϸ�����ؼ�����
		 */
		mrC.start();
		//������Ŀ�������̵߳ȴ��������ʷʹ��
		try {
			mrC.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ս��������");
		System.out.println("лл�ۿ��������壡");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Stage().start();
	}

}
