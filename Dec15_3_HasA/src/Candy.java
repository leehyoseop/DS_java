//Candy has a company : ������
//Company has a Candy : ��ǰ
public class Candy {
	String name;
	String taste;
	Company b;
	
	
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	public void printInfo() {
		System.out.printf("���� �̸�: %s\n", this.name);
		System.out.printf("���� ��: %s\n", this.taste);
	}
	
}
