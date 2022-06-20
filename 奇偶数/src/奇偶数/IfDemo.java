//需求：任意给出一个整数，请用程序实现该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
package 奇偶数;
import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
	//从键盘读取一个整数。
   /*
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	int a = number;
	
	if(a % 2==0) {
		System.out.println("该数是偶数");
	}
	else {
		System.out.println("该数是奇数");
		*/
		
		//从键盘读取一个整数。
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数：");
		int number = sc.nextInt();
		
		//判断整数是奇数还是偶数采用if...else语句
		if(number % 2 == 0) {
			System.out.println(number + "是偶数");
		}
		else {
			System.out.println(number + "是奇数");
		}
	}
}
