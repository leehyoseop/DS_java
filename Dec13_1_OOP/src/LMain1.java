import java.util.Random;
import java.util.Scanner;

//���������� ����
//�Լ� ���
//1.����/2.����/3.�� -> �ܼ�â�� ���ڷ� �Է�
//��ǻ�Ϳ� ������������ �ؼ� 1�������ȿ� ����ϴ��� ����Ҽ� �ְ�

public class LMain1 {
	
	public static int userInput() {
		System.out.println("1�� �Է��ϸ� ���� | 2�� �Է��ϸ� ���� | 3�� �Է��ϸ� �� :");
		return new Scanner(System.in).nextInt();
	}
	
	public static int computerInput() {
		System.out.println("��ǻ�Ͱ� ����/����/�� �� �ϳ��� ���ϴ�!");
		return new Random().nextInt(3)+1;
	}
	
	public static void RockSissorPaper() {
		int win = 0;
		while(true) {
			int user = userInput();
			int computer = computerInput();
			System.out.printf("����: %d �����: %d\n", user, computer);
			if (user == 1 && computer == 1) {
				System.out.println("����[����] ��ǻ��[����] > �����ϴ�!");
			} else if (user == 1 && computer == 2) {
				System.out.println("����[����] ��ǻ��[����] > ��ǻ�� �¸�!");
				break;
			} else if (user == 1 && computer == 3) {
				System.out.println("����[����] ��ǻ��[��] > ���� �¸�!");
				win++;
			} else if (user == 2 && computer == 1) {
				System.out.println("����[����] ��ǻ��[����] > ���� �¸�!");
				win++;
			} else if (user == 2 && computer == 2) {
				System.out.println("����[����] ��ǻ��[����] > �����ϴ�!");
			} else if (user == 2 && computer == 3) {
				System.out.println("����[����] ��ǻ��[��] > ��ǻ�� �¸�!");
				break;
			} else if (user == 3 && computer == 1) {
				System.out.println("����[��] ��ǻ��[����] > ��ǻ�� �¸�!");
				break;
			} else if (user == 3 && computer == 2) {
				System.out.println("����[��] ��ǻ��[����] > ���� �¸�!");
				win++;
			} else if (user == 3 && computer == 3) {
				System.out.println("����[��] ��ǻ��[��] > �����ϴ�!");
			}			
		}
		System.out.printf("������ 1�� ���� ������ �� %dȸ �¸��Ͽ����ϴ�\n", win);
	}
	public static void main(String[] args) {	
//		System.out.println(userInput());
//		System.out.println(computerInput());
		RockSissorPaper();
	}
}
