import java.util.Random;
import java.util.Scanner;

public class CMain1 {
	public static void main(String[] args) {
	//1~10������ ������ ����
	//5�� ���	
//		Random r = new Random();
//		int x = 0;
//		for (int i = 0; i < 5; i++) {
//			x = r.nextInt(10) + 1;
//			System.out.println(x);
//			if(x == 9) {
//				break;
//			}
//		}
//		//1~10������ ������ ������ ���
//		//9�� ������ �ݺ��� ����
//		
//		//�ݺ�Ƚ���� ��Ȯ - for�� (o)
//		//�ݺ� ����(if���� �ݺ�����)
//		// while�� : ������ ���� �˻��ؼ�
//		//������ true�� ���� ��� �ݺ��ؼ� ����κ��� ��Ű��
//		//����κп��� ������ false�� ���� ���ߵ��� �ϰų�
//		//break ��ɾ�� �ݺ����� �����ų �� �ִ�
//		//������ ���� ������ �ݺ��ϴ� �۾��� ����!
//		//���Ѵ�� �ݺ��ϰ� ������ while(true)
//		
//		//while : �ݺ� Ƚ���� ��Ȯ�� �� �� ������
//		//		Ư���� ���ǿ��� ������ϴ� ��쿡 ���!
//		System.out.println("-----------------------");
//		int y = 0;//���⼭ ���� �����ϰ� ������ �޴� �͵� ������
//		while (y != 9) {
//			y = r.nextInt(10)+1;
//			System.out.println(y);
//		}
//		
//		int z = r.nextInt(3)+1;
//		while (z!=3) {
//			System.out.println(z);
//			z = r.nextInt(3)+1;
//		}
//		System.out.println("-----------------------");
//		//do-while�� : ������� �ϰ��� ������ ���߿� �˻�
//		do {
//			System.out.println(z);
//			z = r.nextInt(3)+1;
//		} while (z!=3);
//		
		//1+2+3+...+10
		
		//1~n��° ���� �������� 100�� �Ѿ�� �ݺ����� ����ǰ�
		//�� ���� ������ / n�� ���� ������ 
//		int sum = 0;
//		while (sum<=100) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("���� n�� �Է����ּ��� : ");
//			int num = input.nextInt();
//			for (int i = 1; i < num; i++) {
//				sum+=i;
//			}
//			System.out.println(sum);
//			sum = 0;
//		}
//		int sum = 0;
//		int i = 0;
//		while (sum<100) {
//			i++;
//			sum+=i;
//		}
//		System.out.println(i);
//		System.out.println(sum);
//		
		//1000������ ���� �߿��� ���� ū 15�� �����?
//		int i = 1;
//		int mul = 1;
//		while (15*i<=1000) {
//			i++;
//			System.out.println(15*i);
//		}
		int num2=1000;
		while (num2%15>0) {
			num2--;
		}
		System.out.println(num2);
	}
}