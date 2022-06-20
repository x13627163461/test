package 三个和尚;

//一个寺庙里有三个和尚，已知他们的身高分别为150cm,210cm,165cm，请用程序实现获取这三个和尚的最高身高。
public class OperatorDemo {
	public static void main(String[] args) {
	//定义三个变量
	int Height1 = 150;
	int Height2 = 210;
	int Height3 = 165;
	//用临时变量保存较高身高值
	//int mid = Height1 > Height2  ?  Height1 : Height2 ;
	//用临时变量和最后和尚比较身高，并保存
	//int max = mid > Height3 ? mid : Height3;
	//输出变量
	//System.out.println("max:" + max);
	
	int tempHeight = Height1 > Height2  ?  Height1 : Height2 ;
    int maxHeight = tempHeight > Height3 ? tempHeight : Height3;
	System.out.println("maxHeight:" + maxHeight);
	 
	}
}
