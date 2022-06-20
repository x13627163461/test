package 数组初始化;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[3];
		/*
		 * 左边：
		 *      int:说明数组中的元素类型是int类型；
		 *      []：说明这是一个数组
		 *      arr：这是一个数组的名称
		 * 右边：
		 *       new：为数组申请内存空间
		 *       int说明数组中的元素是 int类型
		 *       []：说明这是一个数组长度
		 *       3：数组长度：数组中的元素个数		 
		 *   */
		//输出数组名
		System.out.println(arr);//[I@626b2d4a

		//输出数组元素
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//给数组中的元素赋值
		arr[0] = 100;
		arr[2] = 200;
		
		//再次输出数组名及元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
