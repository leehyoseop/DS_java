import java.util.Random;
import java.util.Scanner;

public class YMain1 {
	//Ȧ¦���� �����!
	// ���� 10���� ��� �ִٰ�
	//���� 'Ȧ'�ϸ� 
		
	public static void main(String[] args) {
		
		System.out.println("\t<Ȧ¦����>\t");
			
		System.out.println("��ǻ�Ͱ� ������ �����ϰ� �̴��� �Դϴ� ...");
		
		Random r = new Random();
		int coin = r.nextInt(10) + 1; // 0~4 -> 1~5
		System.out.println(coin);
		
		String result = (coin%2 == 0) ? "¦" : "Ȧ"; //�̰� char�� ����
		System.out.println(result);
		
		System.out.println("=====Ȧ | ¦ �߿� ��� �Է�=====");
		Scanner input = new Scanner(System.in);
		String user = input.next();
	
		boolean prize = (result.equals(user));
		
		String end = (prize == true) ? "������ϴ�:)" : "��������ϴ�:("; //���� ���� �̷��� ���ص� �� String x = (result.equals(user)) ? ���� : ����
		System.out.println(end);
		
	}
}
