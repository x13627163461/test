package 数组最大值;
//设计一个方法用于获取数组中元素的最大值，调用方法并输出结果
public class ArrMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个数组，用静态初始化完成数组元素初始化
		int arr[] = {12,45,98,74,60}; 
		//getMax(arr);
		
		int number = getMax(arr);
		System.out.println(number);

	}
	//定义一个方法，获取数组元素的最大值
/*public static void getMax(int[] arr) {
		int max=arr[0];
		for(int x = 0; x < arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		System.out.println(max);
	}
}
*/


//另外一种方法
  public static int getMax(int[] arr) {
	int max=arr[0];
	for(int x = 0; x < arr.length;x++) {
		if(arr[x]>max) {
			max=arr[x];
		}
	}
	return max;
}
}
