/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.Builderfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-15����12:24:22 <br>
 * @see
 * @since 
 */
public class ChickenBurger extends Burger {

	/* (non-Javadoc)
	 * @see runoob.com.design.Builderfactory.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50.5f;
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.Builderfactory.Item#name()
	 */
	public String name() {
		// TODO Auto-generated method stub
		return "ChickenBurger";
	}

}
