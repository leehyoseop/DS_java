
public class Judgement {
	int friendPickNumber;
	int myPickNumber;
	String result;
	int count;

	public void start() {
		Friend f = callFriend();
		Me m = callMe();
		f.friendNum = getNumberFromFriend(f);
		compareNumber(f, m);
	}
	
	public Friend callFriend() {
		return new Friend(); 
	}
	public Me callMe() {
		return new Me();
	}
	public int getNumberFromFriend(Friend f) {
		System.out.println("ģ���� �������� ���ڸ� �ݴϴ�!");
		friendPickNumber = f.giveNumberToJudgement();
		System.err.println(friendPickNumber);
		return friendPickNumber;
	}
	public int getNumberFromMe(Me m) {
		//myPickNumber = m.giveNumberToJudgement();
		System.out.println("1-100������ ���ڸ� �Է��ϼ��� : ");
		return m.giveNumberToJudgement();
	}
	public void compareNumber(Friend f, Me m) {
		count = 1;
		//�̰Ŵ�� for(int turn = 1; true ; turn++){
		//			�̷������� ���൵ �ȴ�. 
		//}
		while(true) {
			myPickNumber = getNumberFromMe(m);
			if (f.friendNum>myPickNumber) {
				result = "Up";
				System.out.println(result);
			} else if (f.friendNum<myPickNumber) {
				result = "Down";
				System.out.println(result);
			} else {
				System.out.printf("�����Դϴ� %d������ ������ ������ϴ�!\n", count);
				break;
			}
			count++;
		}
	}
}