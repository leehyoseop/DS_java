//����
//1.���� ������ �ҽ��� stack������ ��
//2.static ��� �������� static������ ��ġ
//3.JVM�� SMain1.main(�� ȣ��)
//4.���� 
public class SMain1 {
	public static void main(String[] args) {
		//���� ��ü
		//�̸�/�߷�/����
		//���� main���� ���ڰ� ���� ����
		//���� �̸�? -> ��
		//���� �߷�? ->��
		//���� ����? ->��
		//���� ������? ->����
		
		
		System.out.println(Snack.MANUFACTURER);
		Snack s1 = new Snack();
		s1.name = "��Ϲ���Ĩ";
		s1.gram = 150.3;
		s1.price = 3000;
		s1.printInfo();
		
		
		Snack s2 = new Snack();
		s2.name = "�����۽�";
		s2.gram = 200.1;
		s2.price = 3500;
		s2.printInfo();
		//�ϴ� �����ڴ� �� ������ �´�!
		//s2.MANUFACTURER = "�ֺ��";
		s2.printInfo();
		s1.printInfo();
		
		Snack.printTaste();
	}
}