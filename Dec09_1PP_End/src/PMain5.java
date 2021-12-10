//���� ����...0&0!!
//Call by value, Call by Reference
//��� ���� ����Ǿ����� ������ �� �־��!
public class PMain5 {
	
	//Call by value : ������ '��'�� �����ؼ� �Լ��� �Ķ���� ������ ����ϴ� ��
	//Call by reference : ������ �����ϴ� �ּҰ�(������)�� �Ķ���ͷ� �����ϴ� ��
	//stack�⺻�� ���� / �ּҰ� heap
	private static void test(int a, int b[], int c[]) {
		System.out.println("b(green)"+ b); //������
		System.out.println("c(green)"+ c); //������
		System.out.println(a + "a(green)"); //10
		System.out.println(b[0] + "b(green)"); //10
		System.out.println(c[0] + "c(green)"); //10
		a = 100;
		b[0] = 100; // main�ʿ� ������ ��(������)
					// �⺻���� �������� ����!
		c = new int[] {100, 200};
					//�� �״�� ���ο� ��(new)
					// new int[] �� ����� -> ����� ������ ����(���Խ��� �ƴ϶� / ���״�� ���)
					// new int[] �� ���Խ�
		System.out.println("b(green)" + b); //������
		System.out.println("c(green)" + c); //������
		System.out.println("a(green)" + a); //100
		System.out.println(b[0] + "b(green)"); //100
		System.out.println(c[0] + "b(green)"); //100
	}

	public static void main(String[] args) {
		int a = 10;
		int[]b = {10,20};
		int[]c = {10,20};
		System.out.println("b(red)" + b); //������
		System.out.println("c(red)" + c); //������
		test(a,b,c);
		System.out.println(a + "a(red)"); //10
		System.out.println(b[0] + "b(red)"); //10�� �ƴ϶� 100�̴�.�� ���濡 ������ ����. 
		System.out.println(c[0] + "c(red)"); //10 �� ���濡 ������ ���� ����.
											 //test�Լ��� ����� c�ʹ� �ٸ��� ������
	}
}