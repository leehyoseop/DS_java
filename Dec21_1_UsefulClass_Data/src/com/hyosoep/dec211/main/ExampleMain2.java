package com.hyosoep.dec211.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�л��� ������ �Է����ּ���\n(�̸�/�������(yyyyMMdd)/����/����/����): ");
		String student = input.next();
		
		String stName = null;
		String stBirth = null;
		String kor = null;
		String math = null;
		String eng = null;
		StringTokenizer info  = new StringTokenizer(student, "/");
		while (info.hasMoreTokens()) {
			stName = info.nextToken();
			stBirth = info.nextToken();
			kor = info.nextToken();
			math = info.nextToken();
			eng = info.nextToken();
		}
		//�л� ���� ���
		int stYear = Integer.parseInt(stBirth.substring(0, 4));
		Date now = new Date();
		int nowYear = now.getYear()+1900;
		int stAge = nowYear - stYear + 1;
		System.out.printf("�л��� �ѱ� ���� : %d\n", stAge);
		//�л� ����
		int stSumScore = Integer.parseInt(kor)+Integer.parseInt(math)+Integer.parseInt(eng);
		System.out.printf("���� : %d\n",stSumScore);
		//�л� ���
		double stAvgScore = (double)stSumScore/3;  
		System.out.printf("������� : %.2f\n", stAvgScore);
	}
}
