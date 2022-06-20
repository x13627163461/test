package 猜数字;
import java.util.Scanner;
import java.util.Random;
/*需求：
 * 程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
 *   如果猜的数字比真实数字大，提示你猜的数据大了；
 *   如果猜的数字比真实数字小，提示你猜的数据小了；
 *   如果猜的数字比真实数字相等，提示恭喜您猜对了；
 */
public class RandomDemo {
	public static void main(String[] args) {
	    //首先随机生成一个数一个数
		Random r = new Random();
		System.out.println("程序自动生成的数字：" );
		int x = r.nextInt(100)+1;
		System.out.println(x);
		int i = 0;
		//用循环语句，一直从键盘中获取获取数字，并比较大小
		//while( i !=x ) {
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入您猜的数字：" );
			int b =sc.nextInt();
			i++;
		if(b > x) {
			System.out.println("你猜的数据大了");
		}
		else if(b < x) {
			System.out.println("你猜的数据小了");
		}
		else {
			System.out.println("恭喜您猜对了");
			break;
		  }
		
		}	
	}

}
