
public class Coffe {
	String name;
	int price;

	public Coffe() {
		// TODO Auto-generated constructor stub
		//��ü�� ���� �ʱ�ȭ�ϴµ� ����!
	}
	
	public Coffe(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.printf("Ŀ�� �̸� : %s\n", this.name);
		System.out.printf("Ŀ�� ���� : %d", this.price);
	}
}