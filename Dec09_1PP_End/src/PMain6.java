import java.util.Scanner;

//bubble sort
//���ڸ� �Է¹޾Ƽ� �迭�� ������
//������ ���� ���
//����
//���� �� ���� ���
//�����Լ� ����
public class PMain6 {
	
	public static int[] bubbleSort(int[] box) {
		int temp = 0;
		for (int i = 0; i < box.length-1; i++) {
			for (int j = 0; j < box.length-1; j++) {
				if(box[j]>=box[j+1]) {
					temp = box[j];
					box[j] = box[j+1];
					box[j+1] = temp;
				}
			}
		}
		int[] sorted_box = box; 
		return sorted_box; 
	}
	
	public static int[] getNum() {
		Scanner input = new Scanner(System.in);
		
		int[] x = new int [] {0,0,0,0,0};//new int[5] �迭 ���� ��������
		System.out.println("���� 5���� �ϳ��� �Է����ּ���: ");
		for (int i = 0; i < 5; i++) {
			int num = input.nextInt();
			x[i] = num;
		}
		return x;
	}
	
	public static void main(String[] args) {
		int[] array = getNum();
		System.out.println("<������ �迭 ��>");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s ", array[i]);
		}
		//System.out.println(array.length);
		System.out.println();
		System.out.println("<������ �迭 ��>");
		int[]sorted_array = bubbleSort(array);
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s ", sorted_array[i]);
		}		
	}
}
