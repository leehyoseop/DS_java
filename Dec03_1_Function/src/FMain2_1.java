import java.util.Scanner;

public class FMain2_1 {
	
	public static double[] yes() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��ϼ��� : ");
		double height = input.nextDouble();
		System.out.printf("--->Ű : %.1f\n", height);
		
		System.out.println("�����Ը� �Է��ϼ��� : ");
		double weight = input.nextDouble();
		System.out.printf("--->������ : %.1f\n", weight);
		
		return new double[] {height, weight};
	}
	
	public static void main(String[] args) {
		//double result[] = yes();
		System.out.println(yes()[0]);
		
	}
}
