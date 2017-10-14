/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO ��������<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-11����11:56:05 <br>
 * @see
 * @since 
 */
public class UserServiceProxy implements InvocationHandler {
	
	private Object targetObject;
	 public Object createProxyIntance(Object targetObject){
	  this.targetObject = targetObject;
	  return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(), 
	    this.targetObject.getClass().getInterfaces(), this);
	 }
	 
	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		UserServiceBean bean = (UserServiceBean) this.targetObject;
		  Object obj = null;
		  if(bean.getName() != null){
		   if(bean.getName().equals("wuq")){
		    obj = method.invoke(this.targetObject, args);
		   }else{
		    System.out.println("��û�в���Ȩ�ޣ�");
		   }
		  }else{
		   System.out.println("��û�в���Ȩ�ޣ�");
		  }
		  return obj;
	}

}
