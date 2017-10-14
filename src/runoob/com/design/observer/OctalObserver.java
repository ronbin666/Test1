/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.observer;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-18上午12:12:11 <br>
 * @see
 * @since 
 */
public class OctalObserver extends Observer {
	
	public OctalObserver(final Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(this.subject.getState()));
	}

}
