package communication;

public class StudentText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//创建变量
				Student s1 = new Student();
				
				//使用变量
				s1.name="林青霞";
				s1.age =30;
				System.out.println(s1.name+","+s1.age);
				//使用成员方法
				s1.Study();
				s1.work();
				
				//创建变量2
				Student s2 = new Student();
				
				//使用变量
				s2.name="张曼玉";
				s2.age =18;
				System.out.println(s2.name+","+s2.age);
				
				//使用成员方法
				s2.Study();
				s2.work();
				

	}

}
