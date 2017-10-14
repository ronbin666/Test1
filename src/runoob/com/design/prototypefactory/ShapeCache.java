/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.prototypefactory;

import java.util.Hashtable;

import sun.security.krb5.internal.crypto.c;


/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-6����11:44:10 <br>
 * @see
 * @since 
 */
public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(final String id) {
		Shape cachedShape = shapeMap.get(id);
		return (Shape) cachedShape.clone();
	}
	
	// ��ÿ����״���������ݿ��ѯ������������״
    // shapeMap.put(shapeKey, shape);
    // ���磬����Ҫ���������״
	public static void loadShape() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}
	

}
