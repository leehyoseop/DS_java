import java.util.Scanner;

public class CMain5 {
	
	//������ �Է¹޾�
	//	DBA(���� �����ͺ��̽� ������)
	//		��������
	//		���/����
	//		��ɾ�� CRUD
	//		���� Ȱ��
	//	DBP(�����ͺ��̽� ���α׷���)
	//		��ɾ�� CRUD
	//		���� Ȱ��
	//	DBU(�����)
	//		���� Ȱ��
	
	public static String input() {
		return new Scanner(System.in).next();
	}
	
	public static void Database(String x) {
		switch (x) {
		case "DBA":
			System.out.println("��������, ���/����");
		case "DBP":
			System.out.println("��ɾ�� CRUD");
		case "DBU":
			System.out.println("���� Ȱ��");
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("������ �Է� : ");
		Database(input());
		
	}
}
