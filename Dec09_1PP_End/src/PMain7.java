import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain7 {
	
	//10���� ���ڸ� �������� �̾Ƽ� �迭�� ������

	public static void main(String[] args) {
//		Random r = new Random();
//		int num = 0;
//		int arr[] = new int[10];
//		for (int i : arr) {// ���⼭ i�� arr�� ������ ��ҵ�
//			num = r.nextInt(100)+1;
//			arr[i] = num;
//			System.out.printf(arr[i]+" ");
//		}
		
		Scanner input= new Scanner(System.in);
		int cnt=0;
		int[] hyoseop = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d��° ���� �Է�: ", i+1);
			cnt = input.nextInt();
			hyoseop[i] = cnt;
		}
		
		System.out.println("<�迭�� ����� ��>");
		for (int i : hyoseop) {	
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int q = 0; q < hyoseop.length-1; q++) {
			if(hyoseop[q]>=hyoseop[0]) {
				hyoseop[0] = hyoseop[q];
			}
		}
		System.out.printf("�ִ�: %d", hyoseop[0]);
		System.out.println();
		for (int j = 0; j < hyoseop.length-1; j++) {
			if(hyoseop[j]<=hyoseop[0]) {
				hyoseop[0] = hyoseop[j];
			}
		}
		System.out.printf("�ּڰ�: %d", hyoseop[0]);
	}
	
	
	//10���� ���ڸ� ���� �Է��ؼ� �迭�� ��� ���
	
}
