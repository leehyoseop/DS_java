import java.util.Scanner;

//�Ž������� ȯ�����ִ� ���α׷�
//�Լ��� ����ؼ�
//������ ���� ���� : 35000��
//���� : 41530
//�Ž����� 6530 
public class PMain3 {
	public static int PriceofStuff() {
		System.out.println(">���� ������ �Է����ּ���: ");
		return new Scanner(System.in).nextInt();
	}
	public static int userPay() {
		System.out.println(">������ ���� �Է����ּ���: ");
		return new Scanner(System.in).nextInt();
	}
	public static int chkRemain(int stuffprice, int userpay) {
		System.out.print("�Ž����� : ");
		return userpay-stuffprice;
	}
	public static void name() {
		//1.
		int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int i = 0; i<currency.length; i++) {
			if(change >= currency)
		}
	}
	public static void calRemain(int remain) {
		int chk_remain = remain;
		
		int fiftythousand = 0;
		int tenthousand = 0;
		int fivethousand = 0;
		int thousand = 0;
		int fivehundred = 0;
		int hundred = 0;
		int fifty = 0;
		int ten = 0;
		
		while(chk_remain > 0) {
			if (chk_remain/50000>=1) {
				fiftythousand = (chk_remain/50000);
				chk_remain = (chk_remain%50000);
			} else if (chk_remain/10000>=1) {
				tenthousand = (chk_remain/10000);
				chk_remain = (chk_remain%10000);
			} else if (chk_remain/5000>=1) {
				fivethousand = (chk_remain/5000);
				chk_remain = (chk_remain%5000);
			} else if (chk_remain/1000>=1) {
				thousand = (chk_remain/1000);
				chk_remain = (chk_remain%1000);
			} else if (chk_remain/500>=1) {
				fivehundred = (chk_remain/500);
				chk_remain = (chk_remain%500);	
			} else if (chk_remain/100>=1) {
				hundred = (chk_remain/100);
				chk_remain = (chk_remain%100);
			} else if (chk_remain/50>=1) {
				fifty = (chk_remain/50);
				chk_remain = (chk_remain%50);	
			} else if (chk_remain/10>=1) {
				ten = (chk_remain/10);
				chk_remain = (chk_remain%10);
				break;
			}
		}
		System.out.printf("50000: %d��/10000: %d��/5000: %d��\n"
				+ "/1000: %d��/500: %d��/100: %d��/50: %d/10: %d��", fiftythousand, tenthousand, 
				fivethousand, thousand, fivehundred, hundred, fifty, ten);
	}
	public static void main(String[] args) {
		int remain_money = chkRemain(PriceofStuff(), userPay());
		System.out.println(remain_money);
		calRemain(remain_money);
	}
}
