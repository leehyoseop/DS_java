import java.util.Scanner;

//���� 2���� �Է¹޾Ƽ� 
//�������� ¦���� ��� ����, �ƴϸ� ���� �ٽ� �Է�
public class YMain2 {
	public static int getNum1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Num1�� �Է�: ");
		int num1 = input.nextInt();
		return num1;
	}
	public static int getNum2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Num2�� �Է�: ");
		int num2 = input.nextInt();
		return num2;
	}
	public static int sumNum(int x, int y) {
		System.out.println("������ �� ¦���� ����� ���, �ƴϸ� ���� �ٽ� �Է� ...");
		System.out.printf("���� ��� : %d\n", x+y);
		return  ((x+y)%2==0) ? x+y : sumNum(getNum1(), getNum2()); 
	}
	public static void main(String[] args) {
		System.out.println(sumNum(getNum1(), getNum2()));
	}
}
