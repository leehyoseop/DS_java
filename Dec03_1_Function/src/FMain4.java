import java.util.Random;
import java.util.Scanner;

//���� ���߱� ����

//������ 10���� ������ �Ѵ�

//���� ���� ���߸� ����

public class FMain4 {
	
	public static int beginCoin() {
		//Random r = new Random();
		return new Random().nextInt(10)+1;
	}
	public static int userChoice() {
		return new Scanner(System.in).nextInt();
	}
	public static String Answer(int x, int y) {
		System.out.printf("��ǻ�� : %d| ������ : %d\n", x,y);
		return (x == y) ? "�����Դϴ�" : "������ �ƴմϴ�";
	}
	public static void main(String[] args) {
		System.out.println("���ӽ���!\n"
				+ "1~10 �߿��� ���� ������ �Է����ּ��� : ");
		System.out.println(Answer(beginCoin(), userChoice()));
	}
}