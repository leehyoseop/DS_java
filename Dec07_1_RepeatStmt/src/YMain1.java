import java.util.Scanner;
public class YMain1 {
//���� �������� ������ִ� ���α׷�
//�ð��� �Է¹޾Ƽ� -> �ش�ð��� ���ϴ� ������ ��� -> �Է��� �ð������� �ƴϸ� �ٽ� �Է��ϵ���
//���� 9�� ~ 18�� : �п����� ����
//���� 9��, 18�� : QRüũ��
//13�� : ���ɽð�
//18�� �Ѿ ~ 20�� : �������� �ð� 
//6�� ~ 9�� ������ : "��� + �ı� +�п�����"
//20�� ~ 6�� : "�����ð� + ��ħ"	
	public static int getTime() {
		System.err.println("������ Ȯ���� ���� �ð��� �Է��ϼ��� : ");
		return new Scanner(System.in).nextInt();
	}
	public static String chkSchedule(int time) {
		System.err.printf("�Է��� �ð� : %d��\n", time);
		String schedule = "�п����� ����";
		//if�ȿ� ���� �ְ� �� �� �ȿ� if �־ �����ϸ� ������.
		if (time == 13) {
			schedule = "���ɽð�";
			return schedule;
		} else if (time == 9 || time == 18) {
			schedule = "QRüũ��";
			return schedule;
		} else if (time>9 && time<18) {
			return schedule;
		} else if (time>18 && time<20) {
			schedule = "�������� �ð�";
			return schedule;
		} else if (time>=6 && time<9) {
			schedule = "��� + �ı� + �п�����";
			return schedule;
		} else {
			schedule = "�����ð� + ��ħ";
			return schedule;
		}
	}
	public static void main(String[] args) {
		int chk = getTime();
		if (chk >=0 && chk <=24 ) {
			System.out.println(chkSchedule(chk));
		} else {
			System.out.println("24�ð� ���������� �Է��ϼ���!");
			int againChk = getTime();
			System.out.println(chkSchedule(againChk));
		}
	}
}