//����
//	���� 1: ������ 1
//�迭(Array) " [] "
//	���� 1 : ������ n
//�迭 : ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
//	�迭 �� ������ �����͸� '���'��� �θ���.
//	�� ��Ҹ��� �ٿ��� �Ϸù�ȣ�� �ִµ� �� ��Ҹ� �����ϴµ� ���
//	-> �ε���(index) : ������ 0����!
// �迭 ����
// �ڷ���[] ������;	//�迭����
// ������ = new �ڷ���[];
//	-> �ڷ���[] ������ = new �ڷ���[�迭�� ���� ����]
public class AMain1 {
	public static void main(String[] args) {
		int[] english = new int[3]; // 1��
		english[0] = 100;
		english[1] = 70;
		english[2] = 50;
		System.out.println(english.length);
		for (int i = 0; i < english.length; i++) {
			//.length : �� �迭�� ��Ұ� ����� �˷��ش�.
			System.out.println(english[i]);
		}

		int[] math = new int[] {10, 30, 60}; // 2��
		for (int i = 0; i < math.length; i++) {
			
		}
		int[] kor = {20, 40, 60};
		
		int a = 10;
		int[] b = {10, 20};
		System.out.println(a);
		System.out.println(b); // ������(�ּҰ�)
		b[2] = 200;// �迭 ���̰��� �ʰ��� �̷��� ����� �����̴�.
		System.out.println(b[2]);
		int[][] score = {{5,2},{5,2},{5,2}}; 
		System.out.println(score);//�ּҰ�(��ü�� ����)
		System.out.println(score[0]);//�ּҰ�(ù��° �л��� ����)
		System.out.println(score[1][0]);
		//���� : �ּ����̵� �ؼ��� �� �ִ��� ?
	}
}
//java�� ���ϴ� ���?
//�迭�� ���鶧 ����� �����Ǿ�����
//����� �𸣸� �迭�� �������..
//���� �ڹٿ����� �迭�� ���δ�.