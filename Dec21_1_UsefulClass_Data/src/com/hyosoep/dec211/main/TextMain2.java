package com.hyosoep.dec211.main;

import java.util.Scanner;

public class TextMain2 {
	// ���� �Է��� �����ǵ�...
	// a/b/c/d...
	// ���ڶ��.. ������ ���ϰ� + ��ձ��� ���
	// ���ڶ��.. �ѱ��
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] charArray = new String[30];
 		int [] numArray = new int[30];
		
		int i = 0;
		int j = 0;
		int sum = 0;
		double avg = 0;
		int temp_int=0;
		
		System.out.println("���� �Է����ּ��� : ");
		String userInput = input.next();
		String [] userArray = userInput.split("/");
		//���� ó��
//		try {
//			���ʿ� ����� ����
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		for (String string : userArray) {
			if (string.equals("a") || string.equals("b")|| string.equals("c")|| string.equals("d")
					|| string.equals("e")|| string.equals("f")|| string.equals("g")|| string.equals("h")|| string.equals("b")
					|| string.equals("i")|| string.equals("j")|| string.equals("k")|| string.equals("l")|| string.equals("b")
					|| string.equals("m")|| string.equals("n")|| string.equals("o")|| string.equals("p")
					|| string.equals("q")|| string.equals("r")|| string.equals("s")|| string.equals("t")
					|| string.equals("u")|| string.equals("v")|| string.equals("w")|| string.equals("x")
					|| string.equals("y")|| string.equals("z")) {
				charArray[i] = string;
				i++;
			} else {
				temp_int = Integer.parseInt(string);
				numArray[j] = temp_int;
				j++;
			}
		}
//		
//		for (String s : charArray) {
//			//System.out.println(s);
//		}
		for (int k : numArray) {
			//System.out.println(k);
			sum += k;
		}
		avg = (double) sum / (double) j;
		System.out.printf("�� = %d", sum);
		System.out.printf("��� = %f", avg);
	}	
}
