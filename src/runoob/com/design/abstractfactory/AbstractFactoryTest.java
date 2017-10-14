/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.abstractfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-14下午10:35:54 <br>
 * @see
 * @since 
 */
public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//获取颜色工厂
		AbstractFactory shapeFactory = FactoryProduce.getFactory("shape");
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
		
		AbstractFactory colorFactory = FactoryProduce.getFactory("color");
		Color red = colorFactory.getColor("red");
		red.fill();
		Color blue = colorFactory.getColor("blue");
		blue.fill();
	}

}
