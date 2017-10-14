/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-13下午11:18:25 <br>
 * @see
 * @since 
 */
public class StudyUserServiceImpl implements StudyUserService {
	
	private String name;
	
	public StudyUserServiceImpl(final String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.proxyfactory.StudyUserService#hello()
	 */
	public void hello() {
		System.out.println("欢迎您！欢迎您！");
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.proxyfactory.StudyUserService#say()
	 */
	public void say() {
		System.out.println("恭喜你来到此地...恭喜你来到此地...");
		hello();
	}

	/**
	 * 获取name.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
}
