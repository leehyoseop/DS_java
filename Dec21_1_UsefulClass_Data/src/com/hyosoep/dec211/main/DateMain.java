package com.hyosoep.dec211.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Date : ��¥/�ð�
public class DateMain {
	public static void main(String[] args) {
		//�⺻���� -> ����ð�/��¥
		Date now = new Date();
		
		//����ð� ��¥�� ���
		System.out.println(now);
		//Date.java�� ��~~~�� ���� ������� class
		//Y2K�� ������ ���� ����
		//���� ������ ���� ����
		//���� �뷮�� ������ ������ ���� ���� 2�ڸ���...
		//1970 ������ ��ǻ�� : �ӵ��� ������ ��ġ�� �뷮�� ������
		//�����ͷ��� �Ƴ��� ���ؼ� ������ 4byte�� �ƴ� 2byte�� �Ҵ�
		//1900��, 2000�� ���� ���ڸ��� 00���� ���� -> ������ �Ұ���
		//		-> ��ǻ���� ���۵� ���ɼ��� ������
		//����
		//��
		//��
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		
		String[] day = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(day[now.getDay()]);
		
		//Date - �������� -> String 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z",Locale.KOREA);
		String s1 = sdf.format(now);
		System.out.println(s1);
		
		//Ư�� �ð� ��¥
		Date d2 = new Date(2000, 11, 11);
		
		//String - �������� -> Date
		String s2 = "2000/11/11";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d3 = sdf2.parse(s2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//10���� ũ���������� ���� ���� �ϱ��?
		String s3 = "2011/12/25";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d3 = sdf3.parse(s3);
			System.out.println(d3);
			System.out.println(day[d3.getDay()]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
