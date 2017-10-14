/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.prototypefactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-6����11:32:12 <br>
 * @see
 * @since 
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;
	
	abstract void draw();

	/**
	 * ��ȡid.
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * ���� id.
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * ��ȡtype.
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
}
