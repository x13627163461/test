package 偶数求和;

//需求： 求1-100之间的偶数和，并将结果输出在控制台
public class ForDemo {
	public static void main(String[] args) {
		//定义一个变量
		int sum = 0;
/*		for(int i = 0; i <= 100; i+=2) {     这是不进行判断的情况
			sum += i;
		}
	    System.out.println("sum:"+sum);    */
		
//这是黑马程序的写法
		 for(int i = 1; i <= 100; i++) {
			 //判断是否是偶数
			 if(i%2 == 0) {
				 sum += i; 
			 }
		 }
		 System.out.println("1-100之间的偶数和是:"+sum); 
	}

}
