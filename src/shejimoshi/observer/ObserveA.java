/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package shejimoshi.observer;

/**
 * TODO在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-10-14下午10:58:39 <br>
 * @see
 * @since 
 */
public class ObserveA extends Observe {
	
	public ObserveA(final Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see shejimoshi.observer.IObserve#update()
	 */
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("ObserveA print:" + this.subject.getState());
	}

}
