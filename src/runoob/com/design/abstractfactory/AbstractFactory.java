/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.abstractfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-14����10:13:28 <br>
 * @see
 * @since 
 */
public abstract class AbstractFactory {

	private int i = 1;
	public int j = 2;
	abstract public Shape getShape(final String shape);
	
	abstract public Color getColor(final String color);
}
