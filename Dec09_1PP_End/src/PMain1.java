import java.util.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("����� ã����� ���� �Է�(0�Է½� ����): ");
			int num = input.nextInt();
			if (num == 0) {
				System.out.println("����˴ϴ�!");
				break;
			} else {
				for (int i = 1; i <= num; i++) {
					if(num%i == 0) {
						System.out.print(i+",");
					}
				}
				System.out.println();
			}
		}
	}
}