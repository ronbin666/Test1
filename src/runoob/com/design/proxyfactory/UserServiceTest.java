/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-11����11:57:58 <br>
 * @see
 * @since 
 */
public class UserServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserServiceProxy pro = new UserServiceProxy();
		UserServiceBean bean = new UserServiceBean("wuq");
		UserService se = (UserService) pro.createProxyIntance(bean);
		se.say(); 
	}

}
