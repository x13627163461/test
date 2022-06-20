package 三个和尚升级版;
//一个寺庙里有三个和尚，他们的身高必须经过测量得出，请用程序实现获取这三个和尚的最高身高。
//身高未知得用键盘输入实现，，首先导包
import  java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//从控制台分别输入三个和尚的身高
		System.out.println("请输入第一个和尚的身高：" );
		int  height1 = sc.nextInt();
		
		System.out.println("请输入第二个和尚的身高：" );
		int  height2 = sc.nextInt();
		
		System.out.println("请输入第三个和尚的身高：" );
		int  height3 = sc.nextInt();
		int mid = height1 > height2  ?  height1 : height2 ;
		//用临时变量和最后和尚比较身高，并保存
		int max = mid > height3 ? mid : height3;
		//输出变量
		System.out.println("身高最高的是：" + max + "cm");
	
	}
}
