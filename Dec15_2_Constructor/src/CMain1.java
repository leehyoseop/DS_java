
public class CMain1 {
	public static void main(String[] args) {
		//�Ź�
		//����Ű Ȩ������
		Shoes s1 = new Shoes();
		Shoes s2 = new Shoes();
		
		//Shoes("���� ����Ű �׷���", 285, 400000);
		s1.name = "����1 ��������� ����Ű �׷���";
		s1.size = 285;
		s1.price = 400000;
		
		s2.name = "����1 ��Ʈ������ ������";
		s2.size = 285;
		s2.price = 263000;
		
		s1.printInfo();
		System.out.println("==========");
		s2.printInfo();
		
		Shoes.printBrandInfo();
		
		s2.test(s2.name);
		s2.test("zzzz");
	}
}