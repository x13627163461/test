package 水仙花数;

//需求：在控制台输出所有的水仙花数
/* 1。水仙花数是一个三位数
 * 2.水仙花数的个位、十位、百位的数字立方和等于原数
 * 如何取得
 * 1.个位怎么获得   371 % 10 = 1
 * 2.百位怎么获得   371 / 100 =3 
 * 3.十位怎么获得   371 / 10 % 10 =7
 */
public class ForDemo {
	public static void main(String[] args) {
		
 		for(int i = 100; i < 1000; i++) {
 			//获取每个位数上的数字
 			int g = i % 10;
 			int s = i / 100;
 			int b = i / 10 % 10;
 			//如果满足个位、十位、百位的数字立方和等于原数则输出
			if(i ==g*g*g + s*s*s + b*b*b) {
				System.out.println("这是一个水仙花数："+i);
			}
		}
   
	}
}
