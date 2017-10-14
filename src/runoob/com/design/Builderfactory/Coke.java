/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.Builderfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-15上午12:26:52 <br>
 * @see
 * @since 
 */
public class Coke extends ColdDrink {

	/* (non-Javadoc)
	 * @see runoob.com.design.Builderfactory.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.Builderfactory.Item#name()
	 */
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

}
