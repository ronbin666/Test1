/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-11����11:54:27 <br>
 * @see
 * @since 
 */
public class UserServiceBean implements UserService {

	 private String name;
	 
	 public UserServiceBean(){};
	 
	 public UserServiceBean(String name){
	  this.name = name;
	 }
	 
	 public void say() {
	  System.out.println("��ϲ�������˵�...");
	  this.hello();
	 }
	 public void hello() {
	  System.out.println("��ӭ����");
	 }
	 public String getName() {
	  return name;
	 }

}
