import java.util.Scanner;

//�񸸵� �˻� ���α׷�

//Ű, �����Դ� �Է¹�����
//ǥ��ü�� = (Ű-100)*0.9
//�񸸵� = (����ü��/ǥ��ü��) * 100
//�񸸵��� 120�� ������ '��', '�Ⱥ�'

//ctrl + shift + /(numpad) : �Լ� �ݱ�
//ctrl + shift + *(numpad) : �Լ� ����

public class FMain2 {
	public static double enterheight() {
		//Scanner input = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ��� : ");
		//double height = input.nextDouble();
		return new Scanner(System.in).nextDouble();
	}
	public static double enterweight() {
		//Scanner input = new Scanner(System.in);
		System.out.println("�����Ը� �Է��ϼ��� : ");
		//double weight = input.nextDouble();
		//System.out.printf("--->������ : %.1f\n", weight);
		return new Scanner(System.in).nextDouble();
	}
	public static double StandardWeightcalculate(double x) {	
		//double standardweight = (x-100)*0.9;
		//System.out.printf("ǥ��ü�� : %.1f \n", standardweight);
		return (x-100)*0.9;
	}
	public static double Fatcalculate(double x, double y) {
		double Fat = (y/x) *100;
		System.out.printf("Fat : %.1f\n", Fat);
		return Fat;
	}
	public static void checkBMI(double x) {
		String result = (x>120) ? "<<��>>" : "<<�Ⱥ�>>";
		System.out.println(result);
	}
	public static void main(String[] args) {
		checkBMI(Fatcalculate(StandardWeightcalculate(enterheight()), enterweight()));
	}
}