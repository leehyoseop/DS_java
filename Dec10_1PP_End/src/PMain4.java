import java.util.Random;
import java.util.Scanner;

//updown����(�Լ� ���O)
//��ǻ�� : 1~100������ ���ڸ� ����(ex.34)
//������ �Է�

//��ǻ�Ͱ� 1~100������ ���ڸ� �ϳ� �̾��ִ� �Լ�
//������ ���� �Է��� �� �ִ� �Լ�
//�ѹ� �Է����� �� �������� �ƴ��� Ȯ�� + �ݺ����� ���� ������ ���޵�(boolean)
//���� ���⶧���� �ݺ��ϴ� �Լ�
public class PMain4 {
	public static int chooseComputer() {
		Random r = new Random();
		int selectnum  = r.nextInt(100)+1;
		System.out.printf("��ǻ�Ͱ� ���� ����: %d\n", selectnum);
		return selectnum;
	}
	public static int userInput() {
		System.out.println("������ �Է����ּ���: ");
		return new Scanner(System.in).nextInt();
	}
	public static void compareValue(int computernum) {
		int userinput = 0;
		while(true) {
			userinput = userInput();
			if (computernum == userinput) {
				System.out.println("�����Դϴ�!\n���α׷��� ����˴ϴ�.");
				break;
			} else if (computernum>userinput) {
				System.out.println("<Up>");
			} else if (computernum<userinput) {
				System.out.println("<Down>");
			}
		}
	}
	//boolean �� ���ǿ� ������ true���� �����ϰ�,
	//�� ���ǿ� ���� ������ false���� ����
	public static void main(String[] args) {
		compareValue(chooseComputer());
	}
}  