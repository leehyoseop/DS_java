//�˰����� �ô� X -> ���������� �ô�

//�������� ���α׷���(Procedural Programming)
//		������� �� ���α׷����ؼ� ����� �� ����!
//		���� �ϳ� �� ����, ȿ�������� �ڵ� ®��
//		���ǹ�.. �ݺ���..
//		���� : ó���ӵ�, ����ӵ��� ������.

//��ü���� ���α׷���(Object-Oriented Programming)
//		�ǻ�Ȱ�� ǥ������(�츮�� ����ִ� ������ �𵨸�)
//		�ҽ����� �� ����
//		���������� ����
//		����: �ڵ��� ���뼺, ���������� ����, ��Ը� ������Ʈ�� ����.



public class OMain1 {
	public static void main(String[] args) {
	//	�п� ���� �ִ� �ٳ������� ī���� ������ ǥ���ϰ� �ʹ�.
		String name = "�ٳ�������";
	//	ī�� ��ġ�� �п� ��
		String location = "�п� ��";
	//	�Ÿ��� 97.2m
		double distance = 97.2;
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//OOP�� �ٳ������Ҹ� ǥ��
		//��ü(Object) : �ǻ�Ȱ�� �����ϴ� ��� ��
		//		�ؾ�� ������� �ؾ Ʋ�� �ʿ�..!
		//		��ü�� ������� 'Class' �ʿ�
		//��ü�� ����ؼ� �ϳ��� �ϼ�ǰ�� ����� ���α׷��� �����
		//-> ��ü���� ���α׷���
		//-> �����δ� Class�� ��û �����!
		Cafe c = new Cafe();//���ο� ī�並 �ϳ� ����� ���� ����!
		c.name = "�ٳ�������";
		c.location = "�п� ��";
		c.distance = 97.2;
		System.out.println(c.name);
		System.out.println(c.location);
		System.out.println(c.distance);
		
		
		Phone p1 = new Phone();
		p1.model = "������";
		p1.country = "�߱�";
		p1.price = 130.55;
		
		p1.prinInfo();
		p1.Ring();
		
		Phone p2 = p1; // ��׵��� �������� ����. c1�� ������ �ϳ� �� �߰��� ��Ȳ�̴�. -> c2=c1�̶� ����
		
		
		
		
		
	}
}
