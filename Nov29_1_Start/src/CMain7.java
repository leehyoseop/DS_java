import java.util.Scanner;
import java.lang.Math;
//BMI

//�̸�, Ű(cm), ������(kg),
//BMI : ������ / (Ű*Ű) -> Ű : m����
//18.5�̸��̸� ��ü��
//18.5�̻��̸� ����
//25�̻��̸� ��ü��
//30�̻��̸� �浵��
//35�̻��̸� ��������
//40�̻��̸� ����
public class CMain7 {
	public static String enterName() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		return new Scanner(System.in).next();
	}
	public static double enterHeight() {
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		return new Scanner(System.in).nextDouble();
	}
	public static double enterWeight() {
		System.out.print("�����Ը� �Է��ϼ���(kg): ");
		return new Scanner(System.in).nextDouble();
	}
	public static double calBMI(double height, double weight) {
		double result = weight/Math.round((0.01*height*0.01*height));
		//double result = 30; test��
		System.out.printf("BMI ��� ��� : %.1f\n", result);
		return result;
	}
	public static void chkBMI(double bmi) {
		//String result�� ���� return result
		//RAM�� �� ������ ������ ���̸�ǰ�, �ϵ带 �������� �ڵ带 ���̸�ȴ�.
		if (bmi>=40) {
			System.out.println("���:����");
		} else if(bmi>=35) {
			System.out.println("���:��������");
		} else if(bmi>=30) {
			System.out.println("���:�浵��");
		} else if(bmi>=25) {
			System.out.println("���:��ü��");
		} else if(bmi>=18.5) {
			System.out.println("���:����");
		} else if(bmi<18.5) {
			System.out.println("���:��ü��");
		}
	}
	public static void main(String[] args) {
		String name = enterName();
		double height = enterHeight();
		double weight = enterWeight();
		System.out.printf("�̸� : %s | Ű : %.1f | ������ : %.1f\n", name, height, weight);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chkBMI(calBMI(height, weight));
	}
}