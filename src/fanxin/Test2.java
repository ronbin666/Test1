/**
 * 
 */
package fanxin;

/**
 * @author Administrator
 *
 */
public class Test2 {

	public static <T> T getMiddle(T[] arr){
		return arr[arr.length/2];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 test2 = new Test2();
		String[] names = {"Tom","Jack","LiLi","Lusi","ss"};
		//test2.getMiddle(names);
		System.out.println(Test2.getMiddle(names));
	}

}
