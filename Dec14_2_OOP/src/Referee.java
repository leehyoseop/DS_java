
public class Referee {
	int sisterHand;
	int brotherHand;
	int win;
	int draw;
	
	public void start(Sister s, Brother b) {
		System.out.println("<������ ������ ������������ �����մϴ�!>");
		RockSissorPaper(s, b);
	}
	
	public int getSisterHand(Sister s) {
		//sisterHand = s.giveSisterPick();
		System.out.println("������ ���Ƿ� ������������ �ϳ��� ���ϴ�!");
		return s.giveSisterPick();
	}
	public int getBrotherHand(Brother b) {
		//brotherHand = b.giveBrotherPick();
		System.out.println("������ �� �����Դϴ�! ����:1 ����:2 ��:3 �Է����ּ��� ->");
		return b.giveBrotherPick();
	}
	private void RockSissorPaper(Sister s, Brother b) {
		win = 0;
		draw = 0;
		while(true) {
			sisterHand = getSisterHand(s);
			System.err.println(sisterHand);
			brotherHand = getBrotherHand(b);
			System.err.println(brotherHand);
			if((brotherHand - sisterHand) == -1 || (brotherHand - sisterHand) == 2) {
				System.out.printf("������ �й��Ͽ����ϴ�. ������ %d�� %d���� ����߽��ϴ�", win, draw);
				break;
			} else if ((brotherHand - sisterHand) == 0) {
				System.out.println("������ ������ ���º��Դϴ�");
				draw++;
			} else {
				System.out.println("������ �¸��߽��ϴ�");
				win++;
			}
		}
	}
}