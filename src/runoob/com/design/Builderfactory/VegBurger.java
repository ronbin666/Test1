/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.Builderfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-15����12:21:48 <br>
 * @see
 * @since 
 */
public class VegBurger extends Burger {

	/* (non-Javadoc)
	 * @see runoob.com.design.Builderfactory.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.Builderfactory.Item#name()
	 */
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

}
