/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.observer;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-17下午11:56:19 <br>
 * @see
 * @since 
 */
public abstract class Observer {
	
	protected Subject subject;
	
	public abstract void update();

}
