
public class Company {
	String brand;
	String location;
	int worker;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}


	
	public Company(String brand, String location, int worker) {
		super();
		this.brand = brand;
		this.location = location;
		this.worker = worker;
	}

	public void printInfo() {
		System.out.printf("ȸ�� �̸�: %s\n", this.brand);
		System.out.printf("ȸ�� ��ġ: %s\n", this.location);
		System.out.printf("ȸ�� ������: %d\n", this.worker);
	}
}
