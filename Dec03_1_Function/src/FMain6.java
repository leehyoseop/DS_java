import java.util.Scanner;
//����� �Լ� ȣ��
//�Լ��ӿ��� �ڱ� �ڽ��� �� ȣ��
public class FMain6 {
	
	//��������
	//������ �ϳ� ������
	//1+2+3+4+....+�� ���ڱ���
	//�� ���� ���� �����ִ� �Լ�
	public static int inputNum() {
		return new Scanner(System.in).nextInt();
	}
	public static int add(int num) {
		int answer = (num==1) ? 1 :(num + add(num-1));
		return answer;	
	}
	//������ �ϳ� ������ ���丮�� ���� ���ϴ� �Լ�
	public static int factorial(int x) {
		int answer = (x == 1) ? 1 : x*factorial(x-1);
		return answer;
	}
	//�Ǻ���ġ
	public static int fibonacci(int num) {
		int answer = (num==1 || num==2) ? 1 : fibonacci(num-1) + fibonacci(num-2);
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10));
		System.out.println(factorial(4));
		System.out.println(fibonacci(6));
	}
}