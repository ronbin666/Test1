/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-7����11:19:34 <br>
 * @see
 * @since 
 */
public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		//ͼ�񽫴Ӵ��̼���
        image.display(); 
        System.out.println("");
        //ͼ���޷��Ӵ��̼���
        image.display();
	}

}
