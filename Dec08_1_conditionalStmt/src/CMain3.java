import java.util.Scanner;

//Part 1 : �������� ���α׷���(������� �� �Ἥ ����� �� ����!) - �̰�������.
//Part 2 : ��ü���� ���α׷��� - ���������� 
//Part 3 : ��Ÿ ���  �ܺ� ���̺귯��

//���ǹ�, �ݺ���, �迭 -----> �����ø��ǾƵ� ����
//Part 2 : ��ü, ���̺귯��,                                                                                       
public class CMain3 {
	//A : while �̷��� �ݺ����� �̸��� ���̰�, break A;�̷������� ��������ش�.
	//
	public static void show() {
		System.out.println("������ �Է����ּ��� : ");
	}
	public static String getInput() {
		return new Scanner(System.in).next();
	}
	public static void chkJob(String job) {
		if (job.equals("�Ŵ���")) {
			System.out.println("<�ý��۰���.�л�����.�������þ���>");
		} else if (job.equals("����")) {
			System.out.println("<�л�����.�������þ���>");
		} else if (job.equals("�л�")) {
			System.out.println("<�������þ���>");
		}
	}
	public static void main(String[] args) {
		//System.out.printf("%s",chkJob(getInput()));
		while(true) {
			show();
			String input = getInput();
			if (input.equals("��")) {
				System.out.println("����˴ϴ�!");
				break;
			} else {
				chkJob(input);
			}
		}
	}
}