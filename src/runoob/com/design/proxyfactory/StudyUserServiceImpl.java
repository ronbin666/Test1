/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-13����11:18:25 <br>
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
		System.out.println("��ӭ������ӭ����");
	}

	/* (non-Javadoc)
	 * @see runoob.com.design.proxyfactory.StudyUserService#say()
	 */
	public void say() {
		System.out.println("��ϲ�������˵�...��ϲ�������˵�...");
		hello();
	}

	/**
	 * ��ȡname.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
}
