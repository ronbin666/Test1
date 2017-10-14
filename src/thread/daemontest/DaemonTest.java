package thread.daemontest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class DaemonTest implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("进入守护线程" + Thread.currentThread().getName());
		try {
			writeToFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("退出守护线程" + Thread.currentThread().getName());
	}
	
	private void writeToFile() throws Exception {
		File filename = new File("E:" + File.separator + "daemon.txt");
		OutputStream outputStream = new FileOutputStream(filename,true); //true 表示每次往文件里面写数据是追加操作而不是覆盖
		int count = 0;
		while (count < 999) {
			outputStream.write(("\r\nword" + count).getBytes());
			System.out.println("守护线程" + Thread.currentThread().getName() +
					"向文件中写入了word" + count++);
			Thread.sleep(1000);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("进入主线程" + Thread.currentThread().getName());
		DaemonTest daemonTest = new DaemonTest();
		Thread thread = new Thread(daemonTest);
		thread.setDaemon(true);
		thread.start();
		
		Scanner scanner = new Scanner(System.in);  //阻塞主线程
		scanner.next();  //输入完后主线程阻塞解除，接着主线程执行完成，
		  //守护线程因为没有了守护对象也会随着虚拟机结束运行，这样守护线程写入的数据就是不完整的
		System.out.println("退出主线程" + Thread.currentThread().getName());
	}

}
