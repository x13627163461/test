package code0204;

public class OperatorDemo {
	public static void main(String[] args) {
		//定义变量
		int i = 10;
		int j = 20;
		int k = 10;
		
		//==
		System.out.println(i == j);
		System.out.println(i == k);
		
		//!=
		System.out.println(i != j);
		System.out.println(i != k);
		
		//>
		System.out.println(i > j);
		System.out.println(i > k);
		
		//>=
		System.out.println(i >= j);
		System.out.println(i >= k);
		
		//不小心把两个==写成了=
		//把J的值赋值给了i,然后输出i的值
		System.out.println(i = j);
		
	}

}
