import java.util.Scanner;

public class YMain2 {
	
	//������ �ϳ� �Է¹޾Ƽ� �װ� ����� �� ���/ 0�̸� 0���/ ������ �� ���;  
	
	public static int getNum() {
		System.out.println("���� �Ǻ��� ���� �����ϳ��� �Է����ּ��� : ");
		return new Scanner(System.in).nextInt();
	}
	public static void f1(int num) {
		if (num>0) {
			System.out.printf("%d�� ��!",num);
		} else if (num == 0) {
			System.out.printf("%d�� 0!",num);
		} else {
			System.out.printf("%d�� ��!",num);
		}
	}
	public static String f2(int num) {
		String result = "������";
		if (num%3 == 0 && num%4 != 0) {
			result = "3�ǹ��";
			return result;
			//return "3�� ���"
		} else if (num%4 == 0 && num%3 == 0) {
			result = "4�ǹ��";
			return result;
		} else {
			result = "����!";
			return result;
		}
	}
	public static void main(String[] args) {
		f1(getNum());
	}
}