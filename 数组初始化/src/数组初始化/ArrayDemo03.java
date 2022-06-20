package 数组初始化;

public class ArrayDemo03 {
	public static void main(String[] args) { 
	//定义数组,并给数组赋值
			int[] arr = new int[3];
			arr[0] = 100;
			arr[1] = 200;
			arr[2] = 300;
			
			System.out.println(arr);//[I@626b2d4a
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			//定义第二个数组指向第一个数组
			int[] arr2 = arr;
			arr2[0] = 111;
			arr2[1] = 222;
			arr2[2] = 333;
			
			//再次输出数组名及元素
			System.out.println(arr);
			System.out.println(arr[0]);
			System.out.println(arr2);
			System.out.println(arr[0]);
		}


}
