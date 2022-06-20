package communication;


//*********** 学生类测试类*********
public class StudentText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建变量
		Student s = new Student();
		
		//使用变量
		System.out.println(s.name+","+s.age);
		s.name="张曼玉";
		s.age =18;
		System.out.println(s.name+","+s.age);
		
		
		
		//使用成员方法
		s.Study();
		s.work();
		
		
		

	}

}
