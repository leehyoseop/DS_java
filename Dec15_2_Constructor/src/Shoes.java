//������(Constructor)
//	��ü�� ��������� ���� �۾��� �ؾ��ϴµ�...
//	->������ �����!
//	������ �ƿ�����, �޼ҵ���� Ŭ������� ���� �޼ҵ�
//	�����ڸ� ������ ������
//	->�ڹ� �����Ϸ��� �⺻ �����ڸ� ��������!
//	�����ڸ� �ǵ帮��...
//	->�ڹ� �����Ϸ��� �⺻ �����ڸ� �ȸ������
//	->�ý����� �ڵ������� ��ü�� ���鶧�� �ִµ�...
//	->�⺻ �����ڸ� �� -> ����!

//	��ü�� ���鶧 �Ӽ������� �� ����

public class Shoes {
	String name;
	int size;
	int price;
	static String brand = "����Ű";
	//�⺻������(Ctrl + Space)
	public Shoes() {
		// TODO Auto-generated constructor stub
		
	}
	//������ �����ε�(Ctrl + Space + Shift)
	public Shoes(String name, int size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
	public void printInfo() {
		System.out.printf("�𵨸�: %s\n", name);
		System.out.printf("������: %s\n", size);
		System.out.printf("����: %d��\n", price);
		System.out.printf("�귣��: %s\n", brand);
	}
	public static void printBrandInfo() {
		System.out.println(brand);
		System.out.println("��ȿ��");
		System.out.println("������� 152");
	}
	public void test(String name) {
		//���������� �Ķ���͸��� �������
		//this.�� ���̸� ������ �������
		//�Ⱥ��̸� ���� �������� �����´�.
		System.out.println(name);
		System.out.println(this.name);
	}
}