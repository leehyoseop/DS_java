import java.util.Scanner;

public class FMain1_1 {
	
	public static void selfIntro() {
		System.out.println("�̸��� ��ȿ��");
		System.out.println("�ڵ�����ȣ�� 01046779529");
		System.out.println("��⵵ �ϻ�");
	}
	//�Ķ����(parameter) : �Լ��� �����ϴµ� �ʿ��� ���
	public static void cal(int x, int y) {
		int plus = x+y;
		int minus = x-y;
		int multiply = x*y;
		double divide = (double) x/y;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
	}
	
	/*
	public static void calculate() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� a �� �Է��� �ּ���!");
		int a = input.nextInt();
		System.out.println("���� b �� �Է��� �ּ���!");
		int b = input.nextInt();
		
		double remainder = (double) a/b;
		
		System.out.printf("���� ��� : %d | ���� ��� : %d | ���� ��� : %d | ������ ��� : %.1f", a+b, a-b, a*b, remainder);
	
	}
	*/
	public static void main(String[] args) {
		//selfIntro();
		cal(10,20);
	}
}
