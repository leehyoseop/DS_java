
public class FMain4_1 {
	
	public static void print(int a) {
		System.out.println("��!");
	}
	public static void print(String a) {
		System.out.println("��!");
	}
	public static void print(double a) {
		System.out.println("���ƾƾ�!");
	}
	public static void print() {
		System.out.println("������...");
	}
	
	
	
	
	public static void main(String[] args) {
		print(4);
		print("�� ��");
		print(4.4);
		print();
		//�����ε�..�� �˾ƺôµ�..
		//��� �츮�� ù������ �� �����ε��� ����ϰ� �־���!
		System.out.println(); // ====> �̰͵� �����ε��� �����̴�~! �̰ɷ� �Լ����� �ϳ��� �����ߴ�!
		
	}
}
