import java.util.Scanner;

public class Me {
	int numberToJudgement;
	Scanner number = new Scanner(System.in); 
	
	public int giveNumberToJudgement() {
		numberToJudgement = number.nextInt();
		if (numberToJudgement<1 || numberToJudgement>100) {
			System.out.println(">���ڴ� 1���� 100���̿��� �ٽ� �Է��ϼ��� :");
		}
		return (numberToJudgement>=1 && numberToJudgement<=100) ? numberToJudgement :  giveNumberToJudgement();
	}
}
