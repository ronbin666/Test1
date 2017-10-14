/**
 * 
 */
package sort;

/**
 * @author Administrator
 *
 */
public class SortTest {
	
	int count = 0;
	/**
	 * 桶排序.
	 * 时间复杂度O(M+N) M为桶的个数，N为待排序数的个数
	 * 速度快，浪费空间。
	 */
	public void BookSort(final int[] arr) {
		int[] a = new int[11];
		for(int i=0; i < 11; i++) {
			a[i] = 0;  //先全部初始化为0
		}
		for(int j=0; j< arr.length; j++) {
			int index = arr[j];
			a[index] ++;
		}
		
		System.out.println("桶排序前：");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("桶排序后：");
		for(int i=a.length-1; i>=0; i--) {
			for(int j=1; j<=a[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
	
	/**
	 * 冒泡排序.
	 * 耗时，时间复杂度高。
	 * O(N*N)
	 * @param arr
	 */
	public void BubbleSort(final int[] arr) {
		int tmp;
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if (arr[j] < arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				count++;
			}
		}
		
		System.out.println("执行次数为：" + count);
		System.out.println("冒泡排序后：");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void FastSort(final int[] array) {
		int[] arr = array;
		int s = 0;
		int e = arr.length-1;
		QuickSort(arr, s, e);
		
		System.out.println("执行次数为：" + count);
		System.out.println("快速排序后：");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 快速排序.
	 * 时间复杂度为O(NlogN)
	 * @param arr
	 * @param s
	 * @param e
	 */
	public void QuickSort(final int[] arr,int s,int e) {
		int i=s,j=e,tmp;
		for(int m=e; m>=s; m--) {
			j=m;
			if(arr[m] > arr[s]) {
				for(int n=i; n<=j; n++) {  //for(int n=s; n<=j; n++) {  这里做个改进，里面一层循环应该是接着循环，而不是重新循环
					i=n;  
					count++;
					if(arr[n] < arr[s]) {
						tmp = arr[n];
						arr[n] = arr[m];
						arr[m] = tmp;
						break;
					}
				}
			}
			if(j==i) {
				tmp = arr[i];
				arr[i] = arr[s];
				arr[s] = tmp;
				break;
			}
		}
		if(i -2 >= s) {
			QuickSort(arr, s, i-1);
		}
		if(e-2 >= j) {
			QuickSort(arr, j+1, e);
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		final int[] arr = {3,1,5,2,3,4};
		final int[] arr1 = {1,6,1,2,7,9,3,4,5,10,8,8};
		SortTest sortTest = new SortTest();
//		sortTest.BookSort(arr);
//		sortTest.BubbleSort(arr1);
		sortTest.FastSort(arr1);
	}

}
