
public class YMain1 {
	//1~100������ ���� �߿��� 6�� ��������ϰ� ������� ���
	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i%6==0) {
//				sum+=i;
//				System.err.println(i);
//			}
//		}
//		System.err.println(sum);
//		
		//4x+5y = 60
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if(4*x+5*y==60) {
					System.out.printf("(%d,%d)",x,y);
				}
			}
		}
	}
}