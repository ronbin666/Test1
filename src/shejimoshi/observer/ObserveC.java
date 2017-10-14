package shejimoshi.observer;
/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-10-14下午10:59:51 <br>
 * @see
 * @since 
 */
public class ObserveC extends Observe {

	public ObserveC(final Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see shejimoshi.observer.IObserve#update()
	 */
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("ObserveC print:" + this.subject.getState());
	}

}
