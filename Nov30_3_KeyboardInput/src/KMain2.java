import java.util.Scanner;
import java.lang.Math;

public class KMain2 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("*****���� �������� �Է¹޾� ��������ϱ�*****");
		System.out.print("���� �������� �Է��ϼ��� : ");
		double var = keyboard.nextDouble();
		
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println("������Դϴ�.");
		Thread.sleep(1000);
		
		System.out.printf("���� : %.2f", Math.PI * Math.pow(var, 2));
		Thread.sleep(10000);
		
	}
}