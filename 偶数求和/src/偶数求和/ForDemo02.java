package 偶数求和;

public class ForDemo02 {
public static void main(String[] args) {
		int count = 0;
 		for(int i = 100; i < 1000; i++) {
 			//获取每个位数上的数字
 			int g = i % 10;
 			int s = i / 100;
 			int b = i / 10 % 10;
 			//如果满足个位、十位、百位的数字立方和等于原数则输出
			if(i ==g*g*g + s*s*s + b*b*b) {
				count++;
			}
		}
 		System.out.println("水仙花一共有"+count+"个");
	}
}


