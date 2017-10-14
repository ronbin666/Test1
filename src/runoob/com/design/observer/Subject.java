/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-9-17下午11:57:11 <br>
 * @see
 * @since 
 */
public class Subject {

	int state;
	
	final List<Observer> observers = new ArrayList<Observer>();

	/**
	 * 获取state.
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * 设置 state.
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(final Observer observer) {
		this.observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
