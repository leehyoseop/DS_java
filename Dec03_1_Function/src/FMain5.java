import java.util.Random;

public class FMain5 {
	
	//	B �Լ��� / ����� �����̶� ���̰�, ���簰�� �۸�
	//			��Ÿü or ��ü
	//	C �Ķ���� / �Լ��� ȣ���ϴ� �ʿ���(Main �Լ�)
	//	A ����Ÿ�� / �ش� �Լ����� �۾��� ����� ȣ���� ������ ���� ��
	//	public static A B ( C ){
	//		����
	//		return
	//	}
	
	// ���� ������ ���ϴ� �Լ�
	public static String getWeather() {
		//���� ���� ����
		String weather = "����";
		return weather;
	}
	//1.������ ������ �ϳ� ���ϴ� �Լ�
	public static int getRandomNum() {
		return new Random().nextInt(30);
	}

	//3.�� ������ ���� ���� ����ϴ� �Լ�
	public static int sumNum(int num1, int num2) {
		System.out.println(num1+num2);
		return num1+num2; 
	}
	public static void main(String[] args) {
		//2. ������ ���� 2�� ���ؼ�...
		int num1 = getRandomNum();
		System.out.printf("Num1 : %d\n",num1);
		int num2 = getRandomNum();
		System.out.printf("Num2 : %d\n",num2);
		//4. ������ ���� 2�� ���� ���� ���
		System.out.printf("��� : %d",sumNum(num1, num2));
	}
}