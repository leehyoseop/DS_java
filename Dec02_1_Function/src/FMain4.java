import java.util.Scanner;

public class FMain4 {
	//<�����ε�> ***��ޱ��!
	//�Լ����� ����, �Ķ���͸� �ٸ��� �ϴ� ���
	//ȣ���� �� � ���� �־��Ŀ� ���� �Լ��� �ҷ����� �ϴ� ���
	//���� �ڷ����� �ᵵ, �Ķ������ ������ �ٸ��� �����ε��� ����
	//�Ķ������ ������ ���Ƶ�, �ٸ� �ڷ����� ����ϸ� �����ε��� ����
	//���� 2���� ������ �� ���� ������ִ� �Լ�
	
	public static void calculate(int a, int b) {
		int sum = a+b;
		System.out.printf("��� ��� : %d + %d = %d",a,b,sum);
	
	}
	
	public static void calculate(double a, double b) {
		double sum = a+b;
		System.out.printf("��� ��� : %.1f + %.1f = %.1f",a,b,sum);
	
	}
	
	public static void calculate(double a, double b, double c) {
		double sum = a+b+c;
		System.out.printf("��� ��� : %.1f + %.1f + %.1f = %.1f",a,b,c,sum);
	
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" x �Է� : ");
		//double x = input.nextDouble();
		int x = input.nextInt();
		System.out.println(" y �Է� : ");
		//double y = input.nextDouble();
		int y = input.nextInt();
		System.out.println(" z �Է� : ");
		double z = input.nextDouble();
		
		calculate(x,y);
		
	}
}
