/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package shejimoshi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-10-14����11:34:32 <br>
 * @see
 * @since 
 */
public class Subject {
	private int state;
	final List<Observe> observes = new ArrayList<Observe>();
	
	/**
	 * ��ȡstate.
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * ���� state.
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
		notifyAllObserve();
	}
	
	public void attach(final Observe observe) {
		this.observes.add(observe);
	}
	
    private void notifyAllObserve() {
    	for (Observe observe : observes) {
    		observe.update();
		}
    }

}
