import java.util.Scanner;

public class CMain1 {
	public static void main(String[] args) {
		// ����
		// (�ڷ��� ������ = ��;)
		//  = (���Կ�����)
		//  A = B
		// ���׿� �ִ� ���� ���׿� �־��.
		// ������ ���� ���� �� ���
		
		//��Ģ���� (Scanner + ���)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("x �� �Է�! :");
		int x = input.nextInt();
		System.out.println("y �� �Է�! :");
		int y = input.nextInt();
		
		//���� ���� �ϴ� �͵� ������!
		
		double plus = x+y;
		double minus = x-y;
		double multiply = x*y;
		double divide = x/y;
		
		/*
		System.out.printf("���� ���� : %.1f + %.1f = %.1f\n", x, y, x+y);
		System.out.printf("���� ���� : %.1f - %.1f = %.1f\n", x, y, x-y);
		System.out.printf("���� ���� : %.1f * %.1f = %.1f\n", x, y, x*y);
		
		System.out.printf("������ ���� : %.1f / %.1f = %.1f\n"
				+ "������ �� ��� : %.1f", x, y, x/y, x%y);
		*/
		//���������� ����ϴ� ���
		//int / int = int(java����)
		//double / int = double
		//int / double = double
		//double / double = double
		
		//����ȯ
		//double ������ = (double) ���� => �̰� ���ؼ� ����ȯ�� ���ش�.
		
		//int remainder = x % y //�������� �޴� ��.
		
		//�ٽ� �����ε�!
		//x = 10, y = 4
		//A = B�� ���ٴ� �ǹ̰� �ƴ϶�, A�� B�� �־�� ��� �ǹ�
		//System.out.printf("x�� %.1f\n",x);//10.0
		//System.out.printf("y�� %.1f\n",y);//4.0
		//x = y;
		//System.out.printf("x�� %.1f\n",x);//4.0
		//System.out.printf("x�� %.1f\n",y);//4.0
		// ���Կ����� Ȱ��
		//�ѱ��ڶ� ��ġ�� ���ݾ�!
		x += 1;//x=x+1;
		System.out.println(x);
		x -= 1;//x=x-1;
		System.out.println(x);
		x*=3;//x=x*3;
		System.out.println(x);
		x/=2;//x=x/2;
		System.out.println(x);
		x%=2;//x=x%2;
		System.out.println(x);
		
		System.out.println("�� �����ϰ� �����(������ ������ �ִ�!!!)");
		x++;//x = x+1;
		System.out.println(x);
		
		x--;
		System.out.println(x);
		
		//x**;�̰� ����!!!!!
		
	}
}
