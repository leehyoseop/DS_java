import java.util.Iterator;
import java.util.Scanner;

public class CMain1 {
	//���� ���� ������ �Է��ؼ� �޾ƿ���
	public static int getKoreanScore() {
		System.out.println("���� ���� ���� �Է� :");
		int kor = new Scanner(System.in).nextInt();
		return (kor>=0 && kor<=100 ? kor : getKoreanScore());
	}
	
	//���ǹ� : �ۼ��� �ڵ带 ���ǿ� ���� �ڵ��ǽ��� �帧�� �ٸ��� �����ϵ��� �����ϴ� ����
	
	//if�� : ���ǽ��� ����� true, false�� ���๮�� ����
	//if (���� A) {
	//		���� A�� �������� �� (���϶�) �� �κ��� ����
	//} else if (���� B) {
	//		���� A(X), ���� B(O) �� �κ��� ����
	//} else if (C) {
	//		���� A(X), ���� B(X), ���� C(O) �� �κ��� ����
	//} else if (condition) {
	//	
	//} else {
	//		�´� ������ �ϳ��� ������ �� �κ��� ����
	//}
	
	public static void main(String[] args) {
		int kor = getKoreanScore();
		System.out.printf("�Էµ� ���� ���� ���� = %d��\n", kor);
		
		if (kor<60) {
			System.out.println("��");
		} else if (kor>=60 && kor<70) {
			System.out.println("��");
		} else if (kor>=70 && kor<80) {
			System.out.println("��");
		} else if (kor>=80 && kor<90) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		//90���� ���ʴ���ϸ� &&�Ƚᵵ�ȴ�
		
		//���� ������ 50���� �ȵǸ� ��, �ƴϸ� Ī��
		//������ 50���̻�, 60�� �̸��̸� �ƽ��� �Ҹ� ���
		//if�� �ȿ� if���� �� ����ϴ� ���� ����!
		//	if-if���� if-else���� ����
		//		if-if : ���� �ٸ� ���ǹ����� �ؼ��� �Ǿ �����ϰԵ� => ȿ���������� ����!
		//		if-else : �ϳ��� ������ �����Ǹ� ������ �κ��� �������� ���� => ȿ���� O
		//������ 30�� �̸��̸� �ѱ����̽ʴϱ�?
		if (kor<50) {
			System.out.println("��");
		} else if (kor>=50 && kor<60){
			System.out.println("�ƽ��� �Ҹ�");
		} else if (kor<30) {
			System.out.println("�ѱ����̽ʴϱ�?");
		} else {
			System.out.println("Ī��");
		}	
	}
}