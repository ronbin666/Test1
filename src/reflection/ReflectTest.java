/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-3-26上午12:06:28 <br>
 * @see
 * @since 
 */
public class ReflectTest {

	private String fname;
	
	private String lname;
	
	
	/**
	 * @param fname
	 * @param lname
	 */
	public ReflectTest(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
    
	public void getFullName(final String fname, final String lname) {
		System.out.println("全名为：" + fname + " " + lname);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReflectTest reflectTest = new ReflectTest("java", "aspectj");
		try {
			fun(reflectTest);
			invokeMethod(reflectTest, "getFullName", new Object[]{"tim","dk"});
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fun(Object object) throws Exception, IllegalAccessException {
		//
		Field[] fields = object.getClass().getDeclaredFields();
		System.out.println("替换之前的:");
		for (Field field : fields) {
			System.out.println(field.getName() + "=" + field.get(object));
			if (field.getType().equals(java.lang.String.class)) {
				//此处必须修改为true才能修改成员变量
				field.setAccessible(true);
				String org = (String) field.get(object);
				field.set(object, org.replaceAll("a", "b"));
			}
		}
		System.out.println("替换之后的：");
		for (Field field : fields) {
			System.out.println(field.getName() + "=" + field.get(object));
		}
	}
	
	public static Object invokeMethod(final Object owner, final String methodName, 
			final Object[] args) throws Exception, NoSuchMethodException {
		Class ownerClass = owner.getClass();
		Class[] argClass = new Class[args.length];
		for (int i = 0; i < argClass.length; i++) {
		   argClass[i] = args[i].getClass();
		}
		Method method = ownerClass.getMethod(methodName, argClass);
		method.invoke(owner, args);
		return null;
	}

}
