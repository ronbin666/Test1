package thread.test1;

//�����߳�
//ģ����ս˫����Ϊ
public class ArmyRunnable implements Runnable{
	
	//volatile ��֤���߳̿�����ȷ�Ķ�ȡ�����߳�д���ֵ
	//�ɼ��� ref JMM�� happens-beforeԭ��
	volatile boolean keepRunning = true;
	public void run() {
		// TODO Auto-generated method stub
		while(keepRunning) {
			//����5����
			for (int i = 0; i < 5; i ++) {
				System.out.println(Thread.currentThread().getName()+ "�����Է�[" + i + "]");
				//�ó�������ʱ�䣬�´θ�˭��������һ��
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+ "����ս����");
	}


}
