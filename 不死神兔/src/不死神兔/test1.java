package 不死神兔;
/*需求：有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子
 *      假如兔子都不死，问第十二个月的兔子对书是多少。
 * 规律：从第三个数据开始，每一个数据都是前两个数据之和，第1个、第2个数据都是已知的
 * 
 * 思路：
 * 1. 为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
 * 2. 因为第一个月，第二个月兔子的对数是已知的，都是1，所以数组的第一个元素，第二个元素也都是1；
 * 3. 用循环是实现计算每个月的兔子对数
 * 4. 输出数组元素的最后一个值，就是第二十个月的兔子对数
*/

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20；
		int[] arr = new int[20];
		//第一个月和第二个月的兔子对数都是1，所以数组元素第1个和第2个元素值都是1；
		arr[0] = 1;
		arr[1] = 1;
		for(int x = 2;x<arr.length;x++) {
			arr[x]= arr[x-2]+arr[x-1];
			
		}
		System.out.println("第二十个月兔子的对数是："+arr[19]);
	}

}
