
public class PMain4 {
	public static void main(String[] args) {
		String[] ss = {"zz", "gg", "dd", "^_^"};
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]+" ");
		}
		System.out.println("-----------------");
		//String s = null;//
		
		//for-each�� (���� for��)
		//�迭�� ��Ҹ� �����Ҷ��� ���X !
		//	������ ���°� �ƴ� �ӽ÷� �����ش� ���� �����̶�
		//		�������� ���� X!
		//	���� ������ �Ұ���!
		//		i(�ε���)�� ��� ���ϴ� ������ ����� �� ����
		//		�׷��� Ȱ�뵵�� ������..!
		//
		//for(�ڷ��� ������ : �迭��) {����}
		for (String s2 : ss) {
			//�迭 ss�� ��Ҹ� s2��� �׸��� ��Ƽ�...
			System.out.println(s2);//���(�迭�� ��� �������!)
		}
	}
}