import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class OMain5 {
	public static void main(String[] args) throws InterruptedException {
		//Ű �����Ը� �Է¹޾Ƽ� -> �񸸵� �˻� ���α׷�
		
		//ǥ��ü�� = (Ű-100) * 0.9
		//�񸸵� = (���� ü�� / ǥ�� ü��) * 100
		//�񸸵��� 120�� ������ ��, �ƴϸ� �Ⱥ�
		
		Scanner input = new  Scanner(System.in);
		
		System.out.println("Ű�� �Է����ּ���! : ");
		double height = input.nextDouble();
		System.out.println("�����Ը� �Է����ּ���! : ");
		double weight = input.nextDouble();
		
		double standardWeight = (height - 100) * 0.9;
		
		double BMI = (weight/standardWeight) * 100;
		
		System.out.println(BMI);
		
		String result = (BMI>120) ? "��" : "�Ⱥ�";
		//System.out.println(result);
		
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		
		System.out.printf("����� %s�Դϴ�\n", result);
		
		System.out.print("�ƹ��ų� �Է��ϼ��� : ");
		String bye = input.next();
		input.close();
	}
}
