
public class FMain2 {
	
	public static void test(int b) { // �Ķ���� ������ �ҷ����� �� ���� �Լ��ȿ� �ִ� ������ ����Ǿ �׸��� B�� ���� ���ÿ����� ���̰� �ȴ�
		int a = 123;
		System.out.println(b); //30
		System.out.println(a+b); //153
	}
	
	
	
	public static void main(String[] args) {
		int a = 10; //��������
		int b = 20; //�Լ� ������ ���� ����
		int c = 30;
		test(c);
		System.out.println(b); //20
		
		//���� ������������ ���� �̸��� ������ �� �����~
		
	}
}
