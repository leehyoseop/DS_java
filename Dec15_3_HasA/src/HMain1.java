//��ü���� ����
//A has a B : ��� has a �ڵ���
//A is a B : �� is a ����
public class HMain1 {
	public static void main(String[] args) {
//		Candy c = new Candy("û����", "û����");
//		
//		c.printInfo();
		//co.printInfo();
		
		//û���� ������ �Ե����� �������.
		//c.b = co;
		//c.b.printInfo();
		
		//�Ｚ,����,300���� �ٴϴ� ȸ���� ������ ���
		
		//CPU�� i7-1234, RAM 32GB, HDD 500GB�� �Ｚ ��ǻ��
		//��ǻ��/ȸ�� ���� ���.
		Company co = new Company("�Ｚ", "����", 300);
		Computer com = new Computer("i7-1234", 32, 500, co);
		//com.co = co;
		com.printInfo();
	}
}
