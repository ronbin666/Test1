/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-7下午11:11:51 <br>
 * @see
 * @since 
 */
public class RealImage implements Image {
	
	private String fileName;
	
	public RealImage(final String filename) {
		this.fileName = filename;
		loadFromDisk(filename);
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.proxyfactory.Image#display()
	 */
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + fileName);

	}
	
	private void loadFromDisk(String fileName){
       System.out.println("Loading " + fileName);
    }

}
