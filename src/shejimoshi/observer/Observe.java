/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package shejimoshi.observer;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-10-14下午10:49:23 <br>
 * @see
 * @since 
 */
public abstract class Observe {

	protected Subject subject;
	
	public abstract void update();
}
