import java.util.Scanner;

public class CMain2 {
	//�����ϳ��� �Է�
	//�Է¹��� �������� 5���� ũ�� ���ο� ���� y�� ���� 10�� ��Ƽ� ���
	//�Է¹��� �������� 3���� ũ�� ���ο� ���� y�� ���� 20�� ��Ƽ� ���
	public static int getNum() {
		Scanner input = new Scanner(System.in);
		System.out.print("x : ");
		int x = input.nextInt();
		int y = 0;//if�� �ۿ� ������ �����ϰ� if�� �ȿ��� ���� �����Ҽ��ְ� �ϴ� ���� ȿ�����̴�
		if (x>5) {
			y = 10;
		} else if(x>3) {
			y = 20;
		}
		return y;
		/*
		 * else { y = 0; return y; }
		 */
	}
	
	public static void main(String[] args) {
		System.out.println(getNum());
	}
}