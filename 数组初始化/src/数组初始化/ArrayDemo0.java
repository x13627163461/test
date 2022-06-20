package 数组初始化;

public class ArrayDemo0 {

	public static void main(String[] args) {
		//定义数组
		int arr[] = {12, 45, 98, 73, 60};
		
		//定义一个变量，用于保存最大值
		int max = arr[0];
		//与数组中的每个元素逐个进行比较
		for(int x=1;x<arr.length;x++) {
			if(arr[x] >max) {
				max = arr[x];	
				}
			
		}
		System.out.println("max:"+ max);

	}

}
