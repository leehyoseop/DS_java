import java.util.Random;

public class Computer {
	int playcoin;
	int afterShakeCoin;
	Random comShakeCoin = new Random();
	String userAnswer;
	String OddEven;
	public void start() {
		User u = callUser();
		askUser(u);
		judgeResult(shakeCoin(), chooseAnswer(u));
	}
	private User callUser() {
		return new User();
	}
	public void askUser(User u) {
		System.out.println("20�� �߿��� ��� �����ұ��? :");
		this.playcoin = u.selectcoin();
		//System.out.println(this.playcoin);
	}
	public String shakeCoin() {
		//System.out.println(this.playcoin);
		this.afterShakeCoin = comShakeCoin.nextInt(this.playcoin)+1;
		System.out.println("=====");
		System.out.println(this.afterShakeCoin);
		System.out.println("=====");
		if (this.afterShakeCoin%2 == 0) {
			OddEven = "¦";
		} else {
			OddEven = "Ȧ";
		}
		return OddEven;
	}
	public String chooseAnswer(User u) {
		System.out.println("�� �������ϴ�! Ȧ/¦�� �ϳ��� ����ּ���! :");
		this.userAnswer = u.selectOddEven();
		return this.userAnswer;
	}
	public void judgeResult(String com, String user) {
		if (com.equals(user)) {
			System.out.println("�����Դϴ�!");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�!");
		}
		//if else�� ������ ���׿�����!
	}

}