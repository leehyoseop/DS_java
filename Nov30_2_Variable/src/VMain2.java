
public class VMain2 {
	public static void main(String[] args) {
		//����Ż����
		//������ 1000��
		//�뷮�� 80ml
		//����� 99.9%
		//������ ��
		//ȸ�簡 ���̼�
		//��Ȱ�� �ؾ���(%b)
		System.out.println("*****����Ż����*****");
		int price = 1000;
		int capacity = 80;
		double scent = 99.9;		
		String color = "����";
		String company = "���̼�";
		boolean recycle = true;
		
		System.out.printf("���� : %d��\n�뷮 : %dml\n��� : %.1f%%\n"
				+ "���� : %s\nȸ�� : %s\n��Ȱ�� ���� : %b", price, capacity, scent, color, company, recycle);
		//�̸�, ���� ��¥(����, ��, ��) ��°�, �÷�, java���� ����
		String name = "��ȿ��";
		int yy = 2021;
		int mm = 11;
		int dd = 30;
		String resident = "�ϻ�";
		double L_eye = 0.5;
	    double R_eye = 0.4;
	    String exp = "�ʵ��л�";
	    System.out.println("\n########################");		
	    System.out.printf("�̸� : %s\n���� ��¥ : %d�� %d�� %d��\n������ : %s\n��/��÷�: %"
	    		+ ".1f / %.1f\n"
	    		+ "Java���� ���� : %s", name, yy, mm, dd, resident, L_eye, R_eye, exp);
	}
}
