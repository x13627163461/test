package communication2;


//*********** 学生类测试类*********
public class StudentText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Student s = new Student();
		
		//给成员变量赋值
		s.name="张曼玉";
		//s.age =18;
		s.setAge(30);
		s.setAge(-30);
		
		
		//调用show方法
		s.show();
	}

}