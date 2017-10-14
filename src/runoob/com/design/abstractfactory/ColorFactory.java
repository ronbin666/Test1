/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.abstractfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-14下午10:28:47 <br>
 * @see
 * @since 
 */
public class ColorFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see runoob.com.design.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if (color == null) {
			return null;
		} else if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
