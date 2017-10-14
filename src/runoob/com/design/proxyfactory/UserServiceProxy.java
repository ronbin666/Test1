/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO 代理工厂。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-11下午11:56:05 <br>
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
		    System.out.println("您没有操作权限！");
		   }
		  }else{
		   System.out.println("您没有操作权限！");
		  }
		  return obj;
	}

}
