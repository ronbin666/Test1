/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.abstractfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-14����10:31:22 <br>
 * @see
 * @since 
 */
public class FactoryProduce {

	public static AbstractFactory getFactory(final String factoryName) {
		if (factoryName == null) {
			return null;
		} else if (factoryName.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (factoryName.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}
		return null;
	}
}
