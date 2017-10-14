/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.observer;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-18上午12:17:03 <br>
 * @see
 * @since 
 */
public class ObserverPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		System.out.println("First state change: 15");    
		subject.setState(15);
		System.out.println("Second state change: 10"); 
		subject.setState(10);
	}

}
