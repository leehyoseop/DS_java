import java.util.Scanner;

//�� ������
//		����� boolean(true/false) 
//		>(�ʰ�), >=(�̻�), ==(����), !=(�ٸ���), <(�̸�), <=(����)
//		
//
//
public class OMain3 {
	public static void main(String[] args) {
		//���̰������� ���̱ⱸ�� Ÿ�� �ǳ� �������ִ� ���α׷�!
		//Ű(cm), ����
		//Ű�� XXXcm, ���̴� XX��
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��ϼ���");
		double height = input.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = input.nextDouble();
		System.out.println("���̸� �Է��ϼ���");
		int age = input.nextInt();
		
		System.out.printf("Ű %.1fcm | ������ %.1fkg | ���� %d��\n", height, weight, age);
		
		//���� 10���� �Ѵ� ����� Ż �� ����
		
		//boolean ride = (age > 10); �̷������ټ��� �ֳ�!
		
		System.out.printf("���� 10���� �ѳ���?\n "
				+ "----> %b\n", age>10);
		
		//���̰� �ټ��� �̸� ��Ż�� ����
		
		boolean fiveYearRide = (age < 5);
		System.out.printf("���� 5���� �ȳѳ���?\n "
				+ "----> %b\n", fiveYearRide);
		
		//���� 20�츸 Ż �� ����!
		
		boolean twentyYearRide = (age == 20);
		System.out.printf("���� 20���̿���?\n "
				+ "----> %b\n", twentyYearRide);
		
		//���� 1�츸 �ƴ� Ż �� ����!
		
		boolean notOneYearRide = (age != 1);
		System.out.printf("1�츸 �ƴϸ� ž�� �����մϴ�. ž�� ����?\n "
				+ "----> %b\n", notOneYearRide);
		
		//���̰� Ȧ���� ����� Ż �� ����!
		
		boolean oddYearRide = (age%2 != 0);
		System.out.printf("���̰� Ȧ���� ž�� �����մϴ�. ž�� ����?\n "
				+ "----> %b\n", oddYearRide);
		
		//!!!��� ����!!!
		//	~�� : and = &&
		//	~�ų� : or = ||
		//	XOR : ^	(exclusive OR) �� �Է��� ���� �ٸ� �� '1' ������� ���
		//	NOT : ! => ����� ������ �뵵�� ���
		
		//���̰� 3���� �Ѱ�, Ű�� 2m �Ѿ�� Ż �� ����
		boolean ride6 = ((age>3) && (height>200));
		// ���̰� 3���� �Ѱ�, Ű�� 2m �Ѿ�� Ż �� ����
		//        95%			5%    =>95%�� Ȯ���� 2�� �˻��ؾ�...
		// Ű�� 2m �Ѿ�� Ż �� ����, ���̰� 3���� �Ѱ�, 
		//        5%			95%    =>95%�� Ȯ���� 1���� 
		// #####=> Ȯ���� ���� ���� �տ� ��ġ!
		System.out.printf("���̰� 3���� �Ѱ�, Ű�� 2m �Ѿ�� �����մϴ�. ž�� ����?\n "
				+ "----> %b\n", ride6);
		
		//Ű�� 1.9m �Ѱų� ���̰� 50�� �̸��̸� Ż �� ����
		boolean ride7 = ((age<50) || (height/100 > 1.9));
		
		// Ű�� m�� ��ȯ height /= 100;
			
		// #####=> OR�� Ȯ���̳������� �տ� ��ġ
		System.out.printf("Ű�� 1.9m �Ѱų� ���̰� 50�� �̸��̸� ž�� �����մϴ�. ž�� ����?\n "
				+ "----> %b\n", ride7);
		
		// 10 < ���� < 40�̸� Ż �� ����
		boolean ride8 = (age<40 && age>10);
		System.out.printf("���̰� 10 < ���� < 40�̸� �����մϴ�. ž�� ����?\n "
				+ "----> %b\n", ride8);
		
		//���̰� 10�� �̻��̴���, Ű�� 1.5m�̻��̴��� �ϳ���
		//XOR
		height/=100;
		boolean ride9 = (age>=10 || height>=1.5);
		System.out.printf("���̰� 10�� �̻��̴���, Ű�� 1.5m�̻��̸� ž�� �����մϴ�. ž�� ����?\n "
				+ "----> %b\n", ride9);
		
		//ride9�� Ż �� �ִ� ����� ��Ÿ��, ride9�� Ż �� ���� ����� Ż �� ����
		boolean ride10 = (ride9 == false);
		//##### boolean ride10 = !ride9; #####
		System.out.printf("ride9�� Ż �� �ִ� ����� ��Ÿ��, ride9�� Ż �� ���� ����̸� ž�� �����մϴ�. ž�� ����?\n "
				+ "----> %b\n", ride10);
		
		//�Ҵ��
		
		
	}
}