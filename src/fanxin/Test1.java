/**
 * 
 */
package fanxin;

/**
 * @author Administrator
 *
 */
public class Test1<T,U> {
	T frist;
	U second;
	
	public Test1(T first, U second){
		this.frist = first;
		this.second = second;
	}

	/**
	 * @return the frist
	 */
	public T getFrist() {
		return frist;
	}

	/**
	 * @param frist the frist to set
	 */
	public void setFrist(T frist) {
		this.frist = frist;
	}

	/**
	 * @return the second
	 */
	public U getSecond() {
		return second;
	}

	/**
	 * @param second the second to set
	 */
	public void setSecond(U second) {
		this.second = second;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1<String, Integer> test1 = new Test1<String, Integer>("abc", 2);
		System.out.println("first:" + test1.getFrist()+ ",second:" + test1.getSecond());
	}

}
