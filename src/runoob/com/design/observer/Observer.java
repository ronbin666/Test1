/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.observer;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-17����11:56:19 <br>
 * @see
 * @since 
 */
public abstract class Observer {
	
	protected Subject subject;
	
	public abstract void update();

}
