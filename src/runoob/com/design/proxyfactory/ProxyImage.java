/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-7下午11:14:53 <br>
 * @see
 * @since 
 */
public class ProxyImage implements Image {
	
	private String fileName;
	
	private RealImage realImage;
	
	public ProxyImage(final String filename) {
		// TODO Auto-generated constructor stub
		this.fileName = filename;
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.proxyfactory.Image#display()
	 */
	public void display() {
		// TODO Auto-generated method stub
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();

	}

}
