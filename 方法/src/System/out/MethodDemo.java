package System.out;
//需求定义一个方法，在方法中定义一个变量，判断该数据是否是偶数,并返回真假值
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = isEvenNumber(15);
		System.out.println(flag);
		System.out.println(isEvenNumber(15));

	}
	public static boolean isEvenNumber(int number) {
		if(number%2 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
