import java.util.Scanner;

public class CMain4 {
	
	//switch - case (ex :���� ����)
	
	//�켱 ������Է¹޴´�
	//�̺� �Է� -> ��ġ, �����, �Ʒ�, ��
	//�Ϻ� �Է� -> �����, �Ʒ�, ��
	//�� �Է� -> �Ʒ�, ��
	//���� �Է� -> ��
	
	public static void Soldier(String x) {
		switch (x) {
		case "�̺�":
			System.out.println("��ġ, �����, �Ʒ�, ��");
			break;
		case "�Ϻ�":
			System.out.println("�����, �Ʒ�, ��");
			break;
		case "��":
			System.out.println("�Ʒ�, ��");
			break;
		case "����":
			System.out.println("��");
			break;		
		default:
			break;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����� �Է��ϼ��� : ");
		String soldier = input.next();
		Soldier(soldier);
	}
}