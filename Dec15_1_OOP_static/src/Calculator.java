//������� ���� -> �����Ұ� ����.
//			->���� ��ü�� ���� �ʿ� ����.
//			->static�޼ҵ� ���
public class Calculator {
//	int x;
//	int y;
	
	public void plus(int x, int y) {
		System.out.printf("%d + %d = %d",x,y,x+y);
	}
	public static int plus(int x, int y, int z) {
		System.out.printf("%d + %d + %d = %d",x,y,z,x+y+z);
		return x+y+z;
	}
}
