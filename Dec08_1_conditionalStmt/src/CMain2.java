import java.util.Scanner;

public class CMain2 {

	public static void main(String[] args) {
		//�ݺ��� 10�� -> �ݺ��� �ѹ��� �ȳ��ϼ��� x 3����
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if(i == 3) {
//				continue;
//			}
//			System.out.println("�ȳ��ϼ��� 1");
//			System.out.println("�ȳ��ϼ��� 2");
//			System.out.println("�ȳ��ϼ��� 3");
//		}
//		System.out.println("---------------------------");
//		
//		for (int i = 0; i < 10; i++) {
//			if(i%2 == 0) {
//				System.out.println("��!");
//			} else {
//				continue; //�����ݺ�(������) -> Ȧ���϶��� �����ϰ�, �������� �Ѿ��
//				break; //(������), �ݺ��� ��
//				return;//(�������), �Լ��� ��
//			}
//		}
//			//�ڸ�Ʈ ������ �Է¹����ǵ�, ������ "����"�̸� �ݺ��� ��!
		Scanner input = new Scanner(System.in);
		System.out.println("�ڸ�Ʈ ������ �Է����ּ��� :");
		String comment = input.next();//�̰� null�� �θ�ȴ�
		while (true) {
			if (comment.equals("����")) {
				System.out.println("��!");
				break; //������ ���ѹݺ��̴�!
			} else {
				System.out.println("�ڸ�Ʈ ������ �Է����ּ��� :");
			    comment = input.next();
			}
		}
	}
}
