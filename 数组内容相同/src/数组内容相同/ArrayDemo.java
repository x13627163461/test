package 数组内容相同;
/*需求：设计一个方法，用于比较两个数组的内容是否相同
 * 思路：
 * 1.定义两个数组，分别使用数组静态初始化完成数组元素的初始化
 * 2.定义一个方法，用于比较两个数组内容是否相同
 *  返回值类型：Boolean
 * 3.比较两个数组内容是否相同，首先比较数组长度，如果长度不相同，返回至false
 *   其次遍历，比较两个数组中的每一个元素，只有元素不相同，返回false,
 *   最后循环遍历结束后，返回true
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用静态初始化来定义数组
		int[] arr = {11,22,33,44,55};
		//int[] arr2 = {11,22,33,44,55};
		int[] arr2 = {11,22,33,4,55};
		
		//调用方法，用变量接受
		boolean result = compare(arr, arr2);
		System.out.println(result);
	}
	//定义一个方法，用于比较两个数组的内容是否相识
	public static boolean compare(int[] arr,int[]  arr2) {
		//首先比较长度，长度不相等的数组，数组内容一定不相同
		if(arr.length != arr2.length) {
			return false;
		}
		//其次遍历，比较两个数组中的每一个元素，只要元素不相同，返回false
		for(int x=0;x<arr.length;x++) {
			if(arr[x] !=arr2[x]) {
				return false;
			}
		}
		return true;
	}

}
