package 查找;
/*需求：已知一个数组arr={19,28,37,46,50};键盘录入一个数据，
 *     查找该数据在数组中的索引，并在控制台输出找到的索引值。
 *     
 * 思路：
 * 1.定义一个静态数组；
 * 2.键盘录入查找的数据；
 * 3.定义一个索引变量，初始值为-1；（-1就代表查找的数字在数组中不存在）
 * 4.遍历数组，获取数组中的元素；
 * 5.将键盘输入的数与数组中的每一个元素进行比较，如果值相同，则将对应的索引值赋予给索引变量
 * 6.输出索引变量。
 */
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个数组，并完成初始化
		int[] arr = {19,28,37,46,50};
		//通过键盘录入要查找的数据，并使用一个变量接收
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要查找的数字：");
		int i = sc.nextInt();
		//定义一个索引变量，初始值为-1；
	/*	int index =-1;                                    /*index是索引的意思 
		//遍历元素，
		for(int x=0 ; x < arr.length; x++) {
			if(arr[x] == i) {
				index = x;
				
			}
			
		}
*/
		int index = getIndex(arr,i);
		System.out.println("您查找的数字的索引值是："+index);	
		
		

	}

    public static int getIndex(int arr[],int i) {
    	int index =-1;
    	for(int x=0 ; x < arr.length; x++) {
			if(arr[x] == i) {
				index = x;
		     	}
       }
    	return index;
    }
}
    
    
