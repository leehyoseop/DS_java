package com.hyosoep.dec211.main;

import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	//�л��� �̸�/�������(yyyyMMdd)/����/����/��� �Է¹޾Ƽ�
	//�л��� ����, ����, ��հ��� ���
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String studentInfo = null;
		String[] info = new String[4];
		
		
		System.out.println("�л��� ������ �Է����ּ���\n(�̸�/�������(yyyyMMdd)/����/����/����): ");
		studentInfo = input.next();
		info = studentInfo.split("/");
		
		//�л� ���� ���
		int tempStAge = Integer.parseInt(info[1].substring(0, 4));
		//System.out.println(temp_stAge);
		Date now = new Date();
		int tempNow = now.getYear()+1900;
		int real_stAge = tempNow - tempStAge + 1;
		System.out.println(real_stAge);
		
		//�л� ����
		int stSumScore = Integer.parseInt(info[2])+Integer.parseInt(info[3])+Integer.parseInt(info[4]);
		System.out.println(stSumScore);
		
		//�л� ���
		double stAvgScore = (double)stSumScore/3;
		System.out.println(stAvgScore);
		
		
		
	}
}
