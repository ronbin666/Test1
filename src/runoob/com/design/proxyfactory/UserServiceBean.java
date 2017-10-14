/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-11下午11:54:27 <br>
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
	  System.out.println("恭喜你来到此地...");
	  this.hello();
	 }
	 public void hello() {
	  System.out.println("欢迎您！");
	 }
	 public String getName() {
	  return name;
	 }

}
