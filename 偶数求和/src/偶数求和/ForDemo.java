package ż�����;

//���� ��1-100֮���ż���ͣ������������ڿ���̨
public class ForDemo {
	public static void main(String[] args) {
		//����һ������
		int sum = 0;
/*		for(int i = 0; i <= 100; i+=2) {     ���ǲ������жϵ����
			sum += i;
		}
	    System.out.println("sum:"+sum);    */
		
//���Ǻ�������д��
		 for(int i = 1; i <= 100; i++) {
			 //�ж��Ƿ���ż��
			 if(i%2 == 0) {
				 sum += i; 
			 }
		 }
		 System.out.println("1-100֮���ż������:"+sum); 
	}

}
