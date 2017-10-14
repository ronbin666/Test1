/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.Builderfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-15上午12:07:50 <br>
 * @see
 * @since 
 */
public abstract class Burger implements Item {

	/* (non-Javadoc)
	 * @see runoob.com.design.Builderfactory.Item#packing()
	 */
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

    public abstract float price();
}
