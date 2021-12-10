import java.util.Scanner;

public class PMain2 {
	
	static int studentNum = 0;
	static int[] studentScoreArr = null;
	
	public static int chooseNum() {
		Scanner input = new Scanner(System.in);
		System.err.println("1:�л� �� ���� �Է�\n2:�л����� ������ �Է�\n3:�л����� ��������Ʈ ���\n"
				+ "4:�ְ������� ������� ���\n5:���α׷� ����");
		int choice = input.nextInt();
		return choice;
	}
	public static void enterStudentNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("�л� ���� �Է��ϼ��� : ");
		studentNum = input.nextInt(); 
	}
	public static int onlyscore() {
		Scanner input = new Scanner(System.in);
		System.out.printf("���� �Է�:\n");
		return new Scanner(System.in).nextInt();
		//return (score>=0 && score<=100 ? score : getScore())
	}
	public static void enterStudentScore() {
		Scanner input = new Scanner(System.in);
		studentScoreArr = new int[studentNum];
		int score = 0;
		for (int i = 0; i < studentScoreArr.length; i++) {
			System.out.printf("%d��° �л� ", i+1); 
			score = onlyscore();
			studentScoreArr[i] = score;
			while(score<0 || score>100) {
				System.out.println("������ 0-100���̾���մϴ�. �ٽ� �Է����ּ���");
				System.out.printf("%d��° �л� ", i+1);
				score = onlyscore();
				if (score>=0 && score<=100) {
					studentScoreArr[i] = score;
					break;
				}
			}
		}
	}
	public static void showStudentScore() {
		System.out.println("<�л����� ���� ����Ʈ>");
		for (int i : studentScoreArr) {
			System.out.print(i+" ");
		}
	}
	public static void maxScoreandAverageScore() {
		int sumScore = 0;
		int maxScore = studentScoreArr[0];
		for (int i = 0; i < studentScoreArr.length; i++) {
			sumScore += studentScoreArr[i];
		}
		double averageScore = (double) sumScore / studentNum;
		for (int i = 0; i < studentScoreArr.length; i++) {
			if(studentScoreArr[i]>maxScore) {
				maxScore = studentScoreArr[i];
				//���׿����ڵ� ��밡��
			}
		}
		System.out.printf("[�ְ����� : %d | ������� : %.1f]\n", maxScore, averageScore);
	}
	public static void finish() {
		System.out.println("<���α׷��� ����˴ϴ�>");
	}
	public static void studentProgram() {
		//���⼭ �迭 ���� 
		student:while(true) {
			int user_choice = chooseNum();
			switch (user_choice) {
			case 1:
				enterStudentNum();
				break;
			case 2:
				enterStudentScore();
				break;
			case 3:
				showStudentScore();
				break;
			case 4:
				maxScoreandAverageScore();
				break;
			case 5:
				finish();
				break student;
			}
		}
	}
	public static void main(String[] args) {
		studentProgram();
	}
}
