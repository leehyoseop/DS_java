import java.util.Scanner;

public class KMain1 {
	public static void main(String[] args) throws InterruptedException {
		//Scanner : Java�� ����Ǿ��ִ� ��� �� �ϳ�!
		// �� ����� �ҷ����� ���� Import��� ���� ����
		// �� Scanner��� �� ����Ϸ��� ������ �ϳ� �ʿ��ѵ�...
		//Scanner�� ȭ��(��Ŭ������ �ܼ�â)���κ��� �����͸� �Է¹޴� ���
		
		//�Է��� �غ��ؼ� keyboard��� ������ ����
		Scanner keyboard = new Scanner(System.in);
		
		//�̸��� �ܼ�â�� ����Ұǵ�...
		System.out.print("Ű : ");
		double height = keyboard.nextDouble();
		System.out.print("��� �� : ");
		String resident = keyboard.next();
		System.out.print("�Ź� ������ : ");
		int shoeSize = keyboard.nextInt();
		System.out.print("�����ϴ� �Ļ� : ");
		String goodMeal = keyboard.next();
		System.out.print("�Ļ� ���� : ");
		String full = keyboard.next();
		
		System.out.printf("| Ű : %.1f | ��� �� : %s | �Ź� ������ : %d "
				+ "|�����ϴ� �Ļ� : %s |�Ļ� ���� : %s |", height, resident, shoeSize, goodMeal, full);
		
		System.out.print("\n���� ������ �ƹ��ų� �Է� : ");
		String quit = keyboard.next();
		keyboard.close();
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println("���α׷��� �����մϴ�");
		Thread.sleep(1000);
	}
}
