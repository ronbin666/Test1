/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-13����11:44:03 <br>
 * @see
 * @since 
 */
public class StudyUserServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudyUserService service = new StudyUserServiceImpl("ronbin");
		StudyUserServiceProxy proxy = new StudyUserServiceProxy(service);
		StudyUserService proxyObj = (StudyUserService) proxy.createProxyHandler();
		proxyObj.say();
	}

}
