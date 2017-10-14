/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.proxyfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-13下午11:23:48 <br>
 * @see
 * @since 
 */
public class StudyUserServiceProxy implements InvocationHandler {
	
	Object object;
	
	public StudyUserServiceProxy(final Object obj) {
		this.object = obj;
	}
	
	public Object createProxyHandler(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				this.object.getClass().getInterfaces(), this);
	} 

	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		StudyUserServiceImpl service = (StudyUserServiceImpl) this.object;
		Object obj = null;
		if (service == null || !"ronbin".equals(service.getName())) {
			System.out.println("你无权作此操作！");
		} else {
			obj = method.invoke(this.object, args);
		}
		return obj;
	}

}
