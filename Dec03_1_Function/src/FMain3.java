import java.util.Random;
import java.util.Scanner;

//Ȧ¦ (�Լ� ver.)

//�������� ��ǻ�Ͱ� �̰�
//���� �Է� Ȧ���� ¦����
//�׸��� ��


public class FMain3 {
	
	public static int selectCoin() {
		return new Random().nextInt(10)+1;
	}
	public static String judgeOddEven(int x) {
		return (x%2==0) ? "¦" : "Ȧ";
	}
	public static String myChoice() {
		return new Scanner(System.in).next();
	}
	public static String judgeCorrect(String x, String y) {
		return x.equals(y) ? "�¾ҽ��ϴ�" : "Ʋ�Ƚ��ϴ�";
	}
	public static void main(String[] args) {
		int coin = selectCoin();
		System.out.printf("��ǻ�Ͱ� ������ �������� �����մϴ�... : <%d>\n", coin);	
		String computer = judgeOddEven(coin);
		System.out.printf("������ ¦Ȧ�� �Ǵ��մϴ� : <%s>\n", computer);
		System.out.println("������ ¦|Ȧ�� �Է����ּ��� : ");
		String user = myChoice();
		//System.out.println(user);
		System.out.println(judgeCorrect(computer, user));
	}
}
