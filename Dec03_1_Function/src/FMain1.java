import java.util.Random;
import java.util.Scanner;

//���õ� �Լ� !

public class FMain1 {
	
	//������ ������ ����ϴ� �Լ�!
	//Random r = new Random();
	//int coin = r.nextInt(10) + 1; // 0~4 -> 1~5
	
	public static void printRandom() {
		Random r = new Random();//������ ���� ���� �غ�!
		int num = r.nextInt();
		System.out.println(num);
	}
	
	//������ ������ �����ϴ� �Լ�!
	public static int createRandom() {
		Random r1 = new Random();//������ ���� ���� �غ�!
		int num1 = r1.nextInt(10)+1;
		return num1;
	}
	
	//������ �ϳ� ������ Ȧ������ ¦������ ����ϴ� �Լ�
	public static void oddeven(int a) {
		String result = (a%2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(result);
	}
	
	//������ �ΰ� �־����� �ռ��ڰ� ũ�� '��', �޼��ڰ� ũ�ų� ������ '��'����
	public static String classify(int a, int b) {
		String result1 = (a>b) ? "�����" : "��������";
		return result1;
	}	
	
	//JVM -> main�Լ��� �ڵ����� ȣ��	
	public static void main(String[] args) {
		//printRandom();//1
		
		//System.out.println(createRandom());//2
	
		//oddeven(15);//3
		
		//System.out.println(classify(5, 10));//4
		
		//���ɸ޴� (2���� �� �ϳ�)
		//���� �Լ��� �̿��ؼ�... 
		
		//int x = createRandom();
		//System.out.println(x);
		//int y = createRandom();
		//System.out.println(y);
		System.out.println(classify(createRandom(), createRandom()));
		
	}
}
