import java.util.Scanner;

public class CMain6 {
	//1�� =12��
	//�� �޸��� �������� �ٸ��ϴ�
	//������� �Է��� �޾Ƽ�
	//1 3 5 7 8 10 12
	// 2 4 6 9 11
	public static int input() {
		return new Scanner(System.in).nextInt();
	}
	
	public static void MonthandDay(int month) {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println("31�ϱ��� �ֽ��ϴ�");
			break;
		case 2:
			System.out.println("28�ϱ��� �ֽ��ϴ�");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30�ϱ��� �ֽ��ϴ�");
			break;
		default:
			System.out.println("���� ���Դϴ�.");
			break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("���� ���ϰ���� ���� �Է��ϼ��� : ");
		MonthandDay(input());
	}
}
