import java.util.Scanner;

public class KMain4 {
	public static void main(String[] args) {
		//�޴��� �н���
		//������, ����, �, Ƣ��, ...
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("***********�н���***********");
		System.out.println("\t������ : 4500��");
		System.out.println("\t���� : 3000��");
		System.out.println("\t� : 2000��");
		System.out.println("\tƢ�� : 2500��");		
		System.out.println("***********-----***********");
		
		System.out.println("�ֹ����ּ���");
		System.out.print("������ ���� : ");
		int a = keyboard.nextInt();
		System.out.print("���� ���� : ");
		int b = keyboard.nextInt();
		System.out.print("� ���� : ");
		int c = keyboard.nextInt();
		System.out.print("Ƣ�� ���� : ");
		int d = keyboard.nextInt();
		
		System.out.printf("��꼭 : ������%d/����%d/�%d/Ƣ��%d => "
				+ "%,d��",a,b,c,d,4500*a + 3000*b + 2000*c + 2500*d);
		
		
		
		
		
		
		
		
		
	}
}
