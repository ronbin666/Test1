package thread.daemontest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class DaemonTest implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�����ػ��߳�" + Thread.currentThread().getName());
		try {
			writeToFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�˳��ػ��߳�" + Thread.currentThread().getName());
	}
	
	private void writeToFile() throws Exception {
		File filename = new File("E:" + File.separator + "daemon.txt");
		OutputStream outputStream = new FileOutputStream(filename,true); //true ��ʾÿ�����ļ�����д������׷�Ӳ��������Ǹ���
		int count = 0;
		while (count < 999) {
			outputStream.write(("\r\nword" + count).getBytes());
			System.out.println("�ػ��߳�" + Thread.currentThread().getName() +
					"���ļ���д����word" + count++);
			Thread.sleep(1000);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�������߳�" + Thread.currentThread().getName());
		DaemonTest daemonTest = new DaemonTest();
		Thread thread = new Thread(daemonTest);
		thread.setDaemon(true);
		thread.start();
		
		Scanner scanner = new Scanner(System.in);  //�������߳�
		scanner.next();  //����������߳�����������������߳�ִ����ɣ�
		  //�ػ��߳���Ϊû�����ػ�����Ҳ������������������У������ػ��߳�д������ݾ��ǲ�������
		System.out.println("�˳����߳�" + Thread.currentThread().getName());
	}

}
