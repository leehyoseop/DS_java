
public class PMain3 {
	public static void main(String[] args) {
		// printf
		// System.out.printf("%?", ��); �� ����

		// ���� (decimal)
		// %d : ���� �����Ͱ� ���� �ڸ�(10����)
		// %xd : ���ڸ��� ����� ä������ ���
		System.out.printf("%d\n", 1);
		System.out.printf("%3d\n", 1);
		// %0xd : ���ڸ��� 0���� ä���� x�ڸ��� ���ڷ� ������ش�.
		System.out.printf("%d\n", 11);
		System.out.printf("%3d\n", 11);
		System.out.printf("%03d\n", 11);

		// �Ǽ� (float)
		// %f : �Ǽ� �����Ͱ� ���� �ڸ�
		// %.xf : �Ҽ��� ������ �ڸ���(�߸��� �κ��� �ݿø� ó��)
		// ���ڸ��� 0���� ä����
		System.out.printf("%f\n", 123.456789);
		System.out.printf("%.3f\n", 123.456789);
		System.out.printf("%.10f\n", 123.456789);

		// %s : ���ڵ����Ͱ� ���� �ڸ�(String)
		// ���� : �׳� �Է��ϸ� ��!
		// ���� : �׳� �Է��ϸ� Java�� �������� �ؼ��ϱ� ������ -> ����!
		// -> "����" (ū ����ǥ �ȿ� ���ڳֱ�!)

		System.out.printf("%s\n", "Ŭ���� ����");
		System.out.printf("%s\n", "���� �Ϸ絵 �̷���..!");

		
		System.out.printf("%d�� %d�� %d��\n", 2021, 11, 29);
		// ���� ��¥���� ����
		System.out.printf("%d��", 		2021);
		// ��
		System.out.printf("%d��", 11);
		// ��
		System.out.printf("%d��", 29);
		// ���� : ����
		System.out.printf("\n���� : %s", "����");
		// ��� : 5��
		System.out.printf("\n��� : %d��", 5);
		// !!!!!���� : 21.58%
		// %% : %�� ���ڷ� ǥ���� ��(printf����)
		
		System.out.printf("\n���� : %.2f%%", 21.58);

	}
}
