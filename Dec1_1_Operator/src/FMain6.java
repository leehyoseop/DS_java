import java.util.Scanner;

public class FMain6 {
	// ���� �ΰ��� ������, �� �߿� ū ���ڸ� ����ϴ� �Լ�
	public static int bigger(int a, int b) {
		int bigOne1 = (a-b < 0) ? b : a;
		return bigOne1;
	}
	
	//�Ǽ� �ΰ��� ������, �� �߿� ū ���ڸ� �����ִ� �Լ�
	public static double bigger(double a, double b) {
		double bigOne2 = (a-b < 0) ? b : a;
		bigOne2 *=1000;
		return bigOne2;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" x �Է� : ");
		//int x = input.nextInt();
		double x = input.nextDouble();
		
		System.out.println(" y �Է� : ");
		//int y = input.nextInt();
		double y = input.nextDouble();
		System.out.println(bigger(x, y));
		int time=(int)bigger(x, y);
		Thread.sleep(time);
	}
}