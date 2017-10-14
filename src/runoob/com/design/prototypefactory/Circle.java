/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.prototypefactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-6下午11:41:00 <br>
 * @see
 * @since 
 */
public class Circle extends Shape {

	/* (non-Javadoc)
	 * @see runoob.com.design.prototypefactory.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");

	}
	
	public Circle() {
		// TODO Auto-generated constructor stub
		type = "Circle";
	}

}
