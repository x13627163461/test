package 数据输入;

import  java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		int x = sc. nextInt();//从控制台输入
		
		//输出数据
		System.out.println("x:" + x);
	}

}
