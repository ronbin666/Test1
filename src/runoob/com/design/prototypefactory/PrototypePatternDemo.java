/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.prototypefactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-6下午11:55:42 <br>
 * @see
 * @since 
 */
public class PrototypePatternDemo {
	
	public static void main(String[] args) {
		ShapeCache.loadShape();
		
		Shape clonedShape1 = ShapeCache.getShape("1");
		System.out.println("shape: " + clonedShape1.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("shape: " + clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("shape: " + clonedShape3.getType());
	}

}
