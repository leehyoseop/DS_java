import java.util.Scanner;

public class YMain1 {
	//3���� ���� ������ �Է¹޴� �Լ�
	//3���� Ŭ�� -> �ٽ� �Է¹��� �� �ֵ���!
	public static int inputOverThree() {
		Scanner enter  = new Scanner(System.in);
		System.out.println("3���� ũ�� �ٽ� �Է� : ");
		int num = enter.nextInt();
		int result = (num<3) ? num : inputOverThree(); 
		return result;
		//return (num<3) ? num : inputOverThree(); �̷��Ե� ���̴� �͵� ����
	}
	
	//Ȧ���� �Է¹��� �� �ִ� �Լ�
	public static int OnlyOddnum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ȧ���� �Է�! ¦�� �Է��ϸ� �ٽ�! :");
		int num = input.nextInt();
		return (num%2 == 0) ? OnlyOddnum() : num;
	}
	
	//������ �Է¹޴� �Լ� => 0~100
	public static int getZerotoHundred() {
		Scanner input = new Scanner(System.in);
		System.out.println("0~100 ���� ���� �Է��ϼ���! :");
		int num = input.nextInt();
		return (num>=0 && num<=100) ? num : getZerotoHundred();
	}
	
	public static void main(String[] args) {
		//inputOverThree();
		//OnlyOddnum();
		getZerotoHundred();
	}
}