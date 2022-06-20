package code0204;

public class OperatorDemo02 {
	public static void main(String[] args) {
		//定义变量
		int i = 10;
		int j = 20;
		int k = 30;
		
	   //&有false则false, 
		System.out.println( (i > j) & (i > k));//false & false
		System.out.println( (i < j) & (i > k));//true  & false
		System.out.println( (i > j) & (i < k));//false & true
		System.out.println( (i < j) & (i < k));//true & true 
		System.out.println("----------");
		
		//|有true则true
		System.out.println( (i > j) | (i > k));//false | false
		System.out.println( (i < j) | (i > k));//true  | false
		System.out.println( (i > j) | (i < k));//false | true
		System.out.println( (i < j) | (i < k));//true | true
		System.out.println("----------");
		
		//^ 相同为false，不同为true
		System.out.println( (i > j) ^ (i > k));//false ^ false
		System.out.println( (i < j) ^ (i > k));//true  ^ false
		System.out.println( (i > j) ^ (i < k));//false ^ true
		System.out.println( (i < j) ^ (i < k));//true ^ true 
		System.out.println("----------");
		
		//!结果相反
		System.out.println((i>j));//false
		System.out.println(!(i>j));//!false
		System.out.println(!!(i>j));//!!false
		System.out.println(!!!(i>j));//!!!false
		System.out.println("----------");
		
	/* 短路逻辑运算符*/	
	// && 有false则false, 
	    System.out.println( (i > j) && (i > k));//false && false
		System.out.println( (i < j) &&(i > k));//true  && false
		System.out.println( (i > j) && (i < k));//false && true
		System.out.println( (i < j) && (i < k));//true && true 
		System.out.println("----------");
		
		// ||有true则true
		System.out.println( (i > j) || (i > k));//false || false
		System.out.println( (i < j) || (i > k));//true  || false
		System.out.println( (i > j) || (i < k));//false || true
		System.out.println( (i < j) || (i < k));//true || true
		System.out.println("----------");
				
		//&&和&
		//System.out.println((i++ > 100) & (j++ > 100));//false & false
		System.out.println((i++ > 100) && (j++ > 100));//false && false
		System.out.println("i:" +i);
		System.out.println("j:" +j);
		
		//||和|
		System.out.println((i++ > 100) | (j++ > 100));//false & false
		//System.out.println((i++ > 100) || (j++ > 100));//false && false
		System.out.println("i:" +i);
		System.out.println("j:" +j);
	}

}
