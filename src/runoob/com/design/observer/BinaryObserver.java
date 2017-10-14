/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.observer;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-18上午12:05:39 <br>
 * @see
 * @since 
 */
public class BinaryObserver extends Observer {
	
	public BinaryObserver(final Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.observer.Observer#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Binary String: " + Integer.toBinaryString(this.subject.getState()));
	}

}
