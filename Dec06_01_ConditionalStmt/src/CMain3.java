import java.util.Scanner;

public class CMain3 {	
	public static void name() {
	}
	
	public static void main(String[] args) {
		//�����ϳ� �Է¹��� �� �ְ�
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int x = input.nextInt();
		//���ǹ� : if, switch 
		//switch-case ('sw' + �ڵ��ϼ�)
		//switch��: �������� Ư���� ���̳� ���ڿ��� ���
		//break�� ����ؼ� �������� �����ϸ� switch���� ��������
		
		//switch (���� or ��) {
		//case �� A:
		//	���� or ���� ���� A�϶� �� �κ��� ����ȴ�.
		//	break;
		//case �� B:
		//	���� or ���� ���� B�϶� �� �κ��� ����ȴ�.
		//	break;
		//default:
		//	A���� �ƴϰ�, B���� �ƴҶ� �̺κ��� ����.
		//	break;
		//}
		switch (x) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("�Ф�");
			break;
		default:
			System.out.println("����.....");
			break;
		}
	}
}