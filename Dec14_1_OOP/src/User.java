import java.util.Scanner;

//��� ���� : �Ӽ� (�Ұ��Ҷ� ����Ҹ��� ��)
//���� ���� : �� �ൿ�� �ϴ� ���ȸ� �ǹ��ִ°�
//�Ķ���� : �� �ൿ�� �ϴµ� �ʿ��� ���
//���� : �� �ൿ�� �����
public class User {
	Scanner useranswer = new Scanner(System.in);
	
	public int selectcoin() {
		int userpickcoin = useranswer.nextInt();
		if (userpickcoin<1 || userpickcoin>20) {
			System.out.println("������ ������ 1-20�����Դϴ�. �ٽ��Է����ּ���! :");
		}
		return (userpickcoin>=1 && userpickcoin<=20) ? userpickcoin : selectcoin();
	}
	
	public String selectOddEven() {
		return useranswer.next();
	}
}
 