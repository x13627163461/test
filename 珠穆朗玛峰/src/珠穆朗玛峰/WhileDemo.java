package 珠穆朗玛峰;

//需求：世界最高山峰珠穆朗玛峰（8844.43米=8844430毫米），假如我有一张足够大的纸，它的厚度是0.1毫米，
//请问我要折叠多少次，可以折成珠穆朗玛峰的高度。
public class WhileDemo {
	public static void main(String[] args) {
	   double  i = 0.1;
	   //定义一个计数器(count);
	   int count= 0; 
	   while(i <= 8844430){
		   i *= 2;
		   count++;
	   }
	   System.out.println("一共折叠："+count);
	}

}