
public class CMain3_1 {
	public static void main(String[] args) {
		bb : for (int i = 0; i < 3; i++) {
			System.out.printf("i : %d\n", i);
		aa : for (int j = 0; j < 3; j++) {
				System.out.printf("j : %d\n", j);
				for (int j2 = 0; j2 < 3; j2++) {
					System.out.printf("j2 : %d\n", j2);
					if (i == 1) {
						//break; //j2 �ݺ��� ���������� -> aa ���
						break aa; // j �ݺ��� ���������� -> bb ���
						//break bb; // �� ����������
					}
				}
			}
		}
	}
}