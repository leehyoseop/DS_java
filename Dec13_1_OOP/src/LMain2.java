
public class LMain2 {
	//���� �����ϸ鼭 �� ����
	public static void printRule(String[] hand) {
		System.out.println("<<���� ���� �� ���� ����!>>");
		System.out.println("=======================");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%d. %s", i, hand[i]);
		}
		System.out.println("=======================");
	}
	//��ǻ�Ͱ� �� �´���
	
	//������ �� �´���.	���׿����� ���� ����
	//return (userHand>=1 && userHand<=3) ? userHand : getUserHand();
	//�迭
	//user �� com�� �� ���� ���� ���Ѵ�.
	//��� �ߴ��� 
	public static void main(String[] args) {
		String[] hand = {"null","����","����","��"};
	}	
}