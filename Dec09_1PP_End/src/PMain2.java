//PP: �����������α׷���
	//-> ����� ������� �� �ٷﺼ��...
	//������
	//shift������...
	//3>>1 : 6
	//���� ���ڸ� 2������ �ٲ㼭 : 11
	//�������� ���� ���ڸ�ŭ �а�, ��ĭ���� 0 ä���ֱ� : 110
	//������(110)�� �ٽ� �������� : 6
public class PMain2 {
	public static void name() {
		
	}
	public static void main(String[] args) {
		int button1 = 30;
		String[] option = {"24�ð�", "������", "Wifi", "����"};
		for (int i = option.length-1; i >= 0; i--) {
			if(button1>=(1<<i)) {
				System.out.println(option[i]);
				button1-=(1<<i);
			}
		}
		if(button1>=(1<<2)) {
			System.out.println("WIFI");
		}
	}
}
