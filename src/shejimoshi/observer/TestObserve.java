/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package shejimoshi.observer;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-10-15����12:56:32 <br>
 * @see
 * @since 
 */
public class TestObserve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Subject subject = new Subject();
		new ObserveA(subject);
		new ObserveB(subject);
		new ObserveC(subject);
		System.out.println("First state change 10");
		subject.setState(10);
		System.out.println("Second state change 15");
		subject.setState(15);
	}

}
