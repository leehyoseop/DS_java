//��� ���� : ��ü�� �Ӽ� -> (��ü,�Ӽ�)���� ǥ��
//			this : �� ��ü�� ����(���������ϴ�)

//�� ������ ��� ���ڸ� '����'�� ����ٰ� �Ѵٸ�?
// ->�� �� ����ϴ°� *** 'static' ��� ����
//		-��ü�� ��� �� �� �ִ� ����
//			->Ŭ������.xxx�� ���
//		-��ü���� ����Ӽ��� ��Ÿ�� �� ���
//			->��ü�� ������ ���� static ��������� �ϳ���!
//			->�޸� ���� O

// static final ������� -> �ƿ����� / ���� �Ұ��� / ���ȭ
// static final �ڷ�� ������ (�빮�ڷ�/��ȭ) = ����;
// static�� Ȱ���� method
//		�޸𸮰� ����
//		��ü�� �������� ����
//		static�� �ƴ� �ٸ� ����������� ������ �Ұ����ϴ�

public class Snack {
	String name;
	double gram;
	int price;
	static final String MANUFACTURER = "����";
	
	
	//�� ������ ������ ����ϴ� �޼ҵ�
	public void printInfo() {
		System.out.printf("�����̸�: %s\n", name);
		System.out.printf("�߷�: %.1f\n", gram);
		System.out.printf("����: %d\n", price);
		System.out.printf("������: %s\n", MANUFACTURER);
		System.out.println("----------");
	}
	
	public static void printTaste() {
		System.out.println(MANUFACTURER);
		//System.out.println(name); //static�� �ƴ� ��� ������ ������ �߻�
		System.out.println("ũ~JMT");
	}
}