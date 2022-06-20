package communication4;

import communication3.Student;

/*
 * 学生测试类
 */
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Student s = new Student();
		
		//使用set方法给成员变量赋值
		s.setName("林青霞");
		s.setAge(30);
		
		//调用show方法
		s.show();

	}

}
