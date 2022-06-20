package 求和;

//需求：求1-5之间的数据和，并把求和结果在控制台输出
public class ForDemo {
	public static void main(String[] args) {
		//定义一个变量，初始值为0；
		int sum=0;
		for(int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println("sum:"+sum);	
	}
}
