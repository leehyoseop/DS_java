import java.util.Scanner;

public class KMain3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/*
		System.out.println("*****���� ���� �Է� �޾Ƽ� �簢������ ����ϱ�*****");
		
		System.out.print("�����Է� : ");
		double a = keyboard.nextDouble();
		System.out.print("�����Է� : ");
		double b = keyboard.nextDouble();
		
		System.out.printf("�簢�� ���� : %.2f", a*b);
		*/
		
		System.out.println("*****�ð�(��) �Է¹޾Ƽ� ��, �ð������� ��ȯ*****");
		
		
		System.out.print("�ð�(��) �Է� : ");
		double a = keyboard.nextDouble();
		
		System.out.printf("%.1f�� /"
				+ "%.1f�ð�", a/60, a/60/60);
		
		//int / int = int
		// - > ����ȯ�� ���־���Ѵ�.
		
	}
}
