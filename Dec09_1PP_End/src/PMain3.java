
public class PMain3 {
	public static void sum(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		//return x+y;
	}
	public static void sum(int x, int y, int z) {
		System.out.printf("%d + %d + %d= %d\n", x, y, z, x+y+z);
		//return x+y;
	}
	//�����ε� : ���� �Լ� �̸��� �ٸ��� �� �ʿ����
	//	�Լ� �Ķ���ͷ� ������ ���������� ��Ÿ���� ������ (�ڷ���...������)�� �Է����ش�
	public static void printMul(int...n) {
		int mul = 1;
		for (int i = 1; i < n.length; i++) {
			mul*=n[i];//�̰� ���� ����.
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		sum(10,20);
		sum(1,2,3);
		printMul(1,2,3);
	}
}