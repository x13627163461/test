package 反转;
/*需求：已知一个数组arr=[19,28,37,46,50];用程序实现把数组中的元素值交换，
 *      交换后的数组arr=[50,46,37,28,19];并在控制台输出交换后的数组元素。
 * 思路：
 *  1.定义一个数组，用静态初始化完成数组元素的初始化
 *  2.循环遍历数组，初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
 *  3.变量交换
 *  4.遍历数组
 *  
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个变量，并且完成数组元素的初始化
		int[] arr = {19,28,37,46,50};
		for(int start = 0, end=arr.length-1; start <= end; start++, end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;	
		}
		printArray(arr);
	}
	
	//遍历数组的方法；
	/*
	 * 参数类型void
	 * 参数：int[] arr
	 */
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		
		for(int x = 0;x<arr.length;x++) {
			if(x == arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+",");
			}
		}
		System.out.print("]");
	}
}
