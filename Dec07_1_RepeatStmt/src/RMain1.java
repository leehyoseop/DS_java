import java.util.Iterator;
import java.util.Random;

//���±��� �ߴ� �� - ������ ���...!

//�ݺ��� - �̰��� ���...! -> �������

public class RMain1 {
//	1. � �۾��� 53�� �ݺ�(Ƚ��)	
//	for(�����ʱ�ȭ; ���ǽ�; ���� ����) { //(1. ���� �ʱ�ȭ �°�) (2. ���ǽ��� ������(��)) (3. ���� ���)
//									(4. ���� ����) (5. �ٽ� ���� ��) (6. ���� ���) (7. ���� ����) (8. �ٽ� ���� ��)
//									(9. ���� ���) (10. ���Ǻ��� �ȸ����� ����)
//	
//	}
//	2.�۾� - ���ɽð����� �ݺ�(����)
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d | ��]\n", i);
		}
		for (int i = 0; i < 11; i++) {//i++���� i+=2�� �����ϴ�
			System.out.printf("%d \n", 2*i+1);
		}
		for (int i = 5; i >= 1 ; i--) {
			System.out.printf("%d\n", i);
		}
		System.out.println("------------------------");
		//�ݺ����� 5�� ���� ���ȿ� 1~10������ ���ڸ� �����ϰ� �̰������
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int result = r.nextInt(10)+1;
			System.out.println(result);
		}
		//�ݺ��� �ӿ��� ������ ����� ���� ������ ����̴�.
		//�ݺ��� �ۿ��� ���� �ϳ� ���� ���پ��°� ���� �� ȿ�����̴�!
		//int r3 = 0;
		//for (int i = 0; i < args.length; i++) {
		//	r3 = r.nextInt(10) + 1; //������ ���� ���� / ������ �Ѱ��� �ƴϴ�
		//}
		System.out.println("------------------------");
		//�������� ����� 1+2+3+...+10
		int x = 0;
		for (int i = 1; i < 11; i++) {
			x+=i;
		}
		System.out.println(x);
		System.out.println("------------------------");
		//���丮�� �����!
		int fact = 1;
		for (int i = 1; i < 8; i++) {
			fact *= i;
		}
		System.out.println(fact);
		System.out.println("------------------------");
		//1���� 50���� �� �߿�
		int sum = 0; 
		for (int i = 1; i <=50; i++) {
			if (i%3 == 0 && i%5 == 0) {
				sum+=i;
			} else if (i%3 == 0){
				sum+=i;
			} else if (i%5 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		int sum2 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum2+=i;
			}
		}
		System.out.println(sum2);
		System.out.println("------------------------");
	}
}