import java.util.Scanner;

public class FMain5 {
	//������ �ϰ� �ִµ� ������ �ɺθ��� ���ѿ�.
	
	//����̶� ��ġ ��� ���� �� ��������
	
	//���� �Է� �޾Ƽ� �Լ��� �ϼ��� ����
	
	//�ɺθ� �߿�...(��� : 3200 , ��ġ : 2170 , ���� : 1500)
	//���� �󸶰� ������.. ������...
	
	
	//����ϰ� ���� ���� �������� ����...
	
	public static void momTellme() {
		System.out.println("�Ƶ� ����̶� ��ġ ��� ���� �� ������!");
	}
	
	public static int takeMoney() {
		System.out.println("������ �� �� : ");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		
		System.out.printf("������ �� ���� %d��!!!",money);
		
		return money;
		//����(int)�� ���� ���� main�Լ��� return, ��ȯ�ҰŴϱ� return Ÿ���� int�� ����!
	}
	
	public static int calculateMoney(int a) {
		int remainMoney = (a - 3200 - 2170 - 1500);
		System.out.printf("\n���,��ġ,���ڸ� ��� ���� ���� : %d",remainMoney);
		
		return remainMoney;
	}
	
	public static int backMoneyMom(int momMoney) {
		return momMoney;
	}
	
	
	public static void main(String[] args) {
		momTellme();
		int money = takeMoney();
		//System.out.println(money);
		//calculateMoney(money);
		int payback = calculateMoney(money);
		System.out.printf("\n���� �ɺθ��ϰ� ���� �� %d�� �����Ծ��", backMoneyMom(payback));
		
		
	}
	//�Լ��� ǥ���ϴ� 4���� ���!
	//main�� �ҽ��� �ִ��� ª�� �����ϱ� ���ؼ�
	//��ɵ��� ��� �Լ���� �ɷ� ���!
	//����� ������ ȿ�������� ���!
}