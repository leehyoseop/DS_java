import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		//�̸��� �ϳ� �Է¹�����...
		//�� �̸��� 'ȫ�浿'�̶������� true / false
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = input.next();
		
		//System.out.println(name);
		
		//name == "ȫ�浿" ----> �̰� �׳� ���� �� ��
		boolean test = (name.equals("ȫ�浿"));
		boolean test2 = ("ȫ�浿".equals(name));
		//equals ����� �� ��ü�� ���ϱ� ���ؼ� ����Ѵ�.
		//System.out.println(test);
		//System.out.print(test2);
		
		// Shift ������ : ���߼���..!
		// shift : �ű��. �̵��ϴ�
		// (������ << ����)�� ����
		// << : �տ� �ִ� ���� 2������ �ٲ��, �ڿ� �ִ� ����ŭ �������� �о��
		// ����ִ�(������) ĭ ���� 0���� ä���, 2������ �ٽ� 10������ �ٲ��
		
		// ex) ī��!
		//		24�ð� : 1 << 0 = 1
		//		�������� : 1 << 1 = 2
		//		���� : 1 << 2 = 4
		//		������ : 1 << 3 = 8
		
		// A���� : 2	��������
		// B���� : 8 ������
		// C���� : 13 24�ð�/����/������
		// D���� : 6 ��������/����
		
		int c = (150 << 6);
		//System.out.println(c);
		
		// ���� ���� �Է��ؼ� �޾ƺ���
		// ���̰� 20�� �̻��̸� '�ȳ��ϼ���'
		// ���̰� 20�� �̸��̸� 'NAGA!'�� ���
		
		//������
		//		���׿����� : a++, a--, !a, ...
		//		���׿����� : a+b, a>10 
		//		���׿����� : ������ ������ ���� ������ �� ����Ѵ�.
		//					if������ ��ü���������� ������ �����
		//					���ǽ� ? ������ �����Ҷ� �� �� : ���ǺҼ����� �� ��
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = input.nextInt();
		
		//String result = (age >= 20) ? "�ȳ��ϼ���" : "NAGA!";
		
		//System.out.println(result);
		
		//���̰� 50�� �̻��̸� '�����ϼ���'
		//���̰� 50�� �̸��̸� '�ȳ��ϼ���'�� ���
		
		//String result2 = (age >= 50) ? "�����ϼ���" : "�ȳ��ϼ���";
		//System.out.println(result2);
		
		//double result3 = (age>=10) ? 1000 : 50;
		//System.out.println(result3);
		
		//ȫ�浿�� : 1������
		//���̰� ¦�� : 1������
		//�̿ܿ� �������� : 2������
		
		//String place = ((age%2 == 0) || name.equals("ȫ�浿")) ? "1������" : "2������";
		//System.out.println(place);
		
		//�̸��� �������̸鼭 10�� ���ϸ� 1������
		//�������� 2������
		
		String place = ((age <= 10) && name.equals("������")) ? "1������" : "2������";
		System.out.println(place);
	
	}
}
