package ż�����;

public class ForDemo02 {
public static void main(String[] args) {
		int count = 0;
 		for(int i = 100; i < 1000; i++) {
 			//��ȡÿ��λ���ϵ�����
 			int g = i % 10;
 			int s = i / 100;
 			int b = i / 10 % 10;
 			//��������λ��ʮλ����λ�����������͵���ԭ�������
			if(i ==g*g*g + s*s*s + b*b*b) {
				count++;
			}
		}
 		System.out.println("ˮ�ɻ�һ����"+count+"��");
	}
}


