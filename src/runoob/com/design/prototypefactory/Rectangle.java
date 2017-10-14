/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.prototypefactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-6下午11:37:36 <br>
 * @see
 * @since 
 */
public class Rectangle extends Shape {

	/* (non-Javadoc)
	 * @see runoob.com.design.prototypefactory.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method.");

	}
	
	public Rectangle() {
		type = "Rectangle";
	}

}
