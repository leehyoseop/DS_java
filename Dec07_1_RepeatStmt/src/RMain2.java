import java.util.Iterator;

//���� for�� >> for�� �ȿ� for�� >> (��ø for��)

public class RMain2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("-----%d�� ������-----\n", i);
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//			}
//			System.out.println("------------------");
//		}
//		
//		System.out.println("<2��>\t\t<3��>\t\t<4��>\t\t<5��>"
//				+ "\t\t<6��>\t\t<7��>\t\t<8��>\t\t<9��>\t\t");
//		for (int i = 1; i < 10; i++) {
//			for (int j = 2; j < 10; j++) {
//				System.out.printf("%d x %d = %d\t", j , i, j*i);
//				if (j == 9) {
//					System.out.println("\n");//�̷��� ���� ������ �����ϱ� ù��° �ݺ���
//				}
//			}
//		}
// �����	-> ������������
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*") ;
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 ; j++) {
//				if (j<i) {
//					System.out.print(" ");
//				} else if(i == j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(" ");
				if(i == j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//����������
		//��������
		//������
		//����
		//��
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i ; j--) {
				System.out.print((i%2 == 0) ? "��" : "��");
			}
			System.out.println();
		}
		//��
		//������
		//����������
		//��������������
		//������������������
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print((i%2 == 0) ? "��" : "��");
			}
			System.out.println();
		}
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}