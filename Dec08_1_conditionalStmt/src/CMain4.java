import java.util.Scanner;

public class CMain4 {
	//ATM����� �ϴ� ���α׷�
	//1�� ���� ����
	//2�� ���� ���
	//3�� ���� �ܰ�Ȯ��
	static int account = 0;//��������<�ܰ�>
	
	public static void show() {
		System.out.println("ATM 1����|2���|3�ܰ�Ȯ��|4���� �� �������ּ��� : ");
	}
	public static int getInput() {
		return new Scanner(System.in).nextInt();
	}
	public static void ATM(int num) {
		Scanner input = new Scanner(System.in);
		int money= 0;
		if (num == 1) {
			System.out.println("�����Ͻ� �ݾ��� �Է����ּ��� : ");
			money = input.nextInt();
			account += money;
		} else if (num == 2) {
			System.out.println("����Ͻ� �ݾ��� �Է����ּ��� : ");
			money = input.nextInt();
			account -= money;
		} else if (num == 3) {
			System.err.printf("�ܰ� : %d\n", account);	
		}
	}
	public static void main(String[] args) {
		while (true) {
			show();
			int num = getInput();
			if (num == 4) {
				System.out.println("����˴ϴ�!");
				break;
			} else {
				ATM(num);
			}
		}
	}
}