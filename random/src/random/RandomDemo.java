package random;

import java.util.Random;
public class RandomDemo {
	public static void main(String[] args) {
		//创建对象
		Random r = new Random();
		//用循环获取10个随机数
		for(int i =0;i<10;i++) {
		//获取随机数
		int number = r.nextInt(10);
		System.out.println("number:" + number);
		}
		//需求：获取一个1-100 之间的随机数
		int x = r.nextInt(100)+1;
		System.out.println(x);
	}

}
