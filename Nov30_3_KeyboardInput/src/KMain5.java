import java.util.Scanner;

public class KMain5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("***************��������***************");
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = input.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		double korean = input.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		double english = input.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		double math = input.nextDouble();
		
		System.out.printf("%s �л��� ������ => "
				+ "���� : %.1f ������� : %.1f", name, korean+english+math, (korean+english+math)/3);
	}
}
