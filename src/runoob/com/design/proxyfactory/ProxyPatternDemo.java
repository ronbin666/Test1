/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-7下午11:19:34 <br>
 * @see
 * @since 
 */
public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		//图像将从磁盘加载
        image.display(); 
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
	}

}
