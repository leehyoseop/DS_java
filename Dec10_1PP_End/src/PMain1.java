import java.util.Scanner;

//main�Լ����� ����
//1�� �Է��ϸ� �л� �� ���� �Է¹��� �� �ִ� ���
//2�� �Է��ϸ� �� �л����� ������ �Է� ���� �� �ְ� 

public class PMain1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int studentNum = 0;
		int maxScore = 0;
		int sumScore = 0;
		double averageScore = 0;
		int[] studentNumArray = null;
		int[] studentScoreArray = null;
		
		student:while(true) {
			System.err.println("1:�л� �� ���� �Է�\n2:�л����� ������ �Է�\n3:�л����� ��������Ʈ ���\n"
					+ "4:�ְ������� ������� ���\n5:���α׷� ����");
			System.err.println("===��ȣ�� �������ּ��� : ====");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("�л� ���� �Է����ּ���:");
				studentNum = input.nextInt();
				studentNumArray = new int[studentNum];
				break;
			case 2:
				studentScoreArray = new int[studentNum];
				for (int i = 0; i < studentNumArray.length; i++) {
					System.out.printf("�л� %d�� ������ �Է����ּ���: \n", i+1);
					int studentScore =input.nextInt(); 
					studentScoreArray[i] = studentScore;
					//�׳� �ٷ� input���� �޴°͵� ����
				}
				break;
			case 3:
				System.out.println("�л����� ���� ����Ʈ");
				for (int i : studentScoreArray) {
					System.out.print("["+ i +"]");
				}
				break;
			case 4:
				maxScore = studentScoreArray[0];
				for (int i = 0; i < studentScoreArray.length; i++) {
					sumScore += studentScoreArray[i];
				}
				averageScore = (double) sumScore / studentNum;
				for (int i = 0; i < studentScoreArray.length; i++) {
					if(studentScoreArray[i]>maxScore) {
						maxScore = studentScoreArray[i];
						//���׿����ڵ� ��밡��
					}
				}
				System.out.printf("[�ְ����� : %d | ������� : %.1f]\n", maxScore, averageScore);
				break;
			case 5:
				System.out.println("���α׷��� ����˴ϴ�");
				break student;
			}
		}
	}
}
