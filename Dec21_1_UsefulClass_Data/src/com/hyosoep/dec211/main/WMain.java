package com.hyosoep.dec211.main;

//Wrapper Class : �ڷ��� �⺻������ ��ü��
//	Integer, Double, Long, Void, Boolean
//	�⺻ �ڷ����� ��ü�� �ٷ�� ���� ����ϴ� Class
//	Java�� �⺻���� ���� ������ �ִ� ��ü ������ ����
//	�⺻���� ������ �ִ� ���� ������ �ΰ� �� ���� �����ϴ� ���
//	Boxing : �⺻�� -> ����Ŭ����
//	Unboxing : ����Ŭ���� -> �⺻��

//	1.��ü�� Ŭ������ �����ϴ� method�� ����Ҷ�
//	2.Ŭ������ �����ϴ� ����� ���(MIN_VALUE, MAX_VALUE)
//	3.����, ���ڷ� ����ȯ�� �Ҷ�

public class WMain {
	public static void main(String[] args) {
		int a = 10;
		String a1 = "100";
		Integer b = new Integer(a1);
		b.intValue();
		System.out.println(b);
		System.out.println(b.TYPE);
		
		
		//�⺻�� -> ��ü��
		double c = 123.456;
		Double d = new Double(c);
		
		//��ü�� -> �⺻��
		Boolean e = new Boolean(true);
		boolean f = e.booleanValue();
		
		//��ü�� -> �⺻�� (���� ������ �ڵ����� ���� : Auto unboxing)
		Integer g = 10;
		
		//�⺻�� -> ��ü�� (���� ������ �ڵ����� ���� : Auto boxing)
		int h = g;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		//int �ڷ����� ���� -> String(������)����
		String num1 = Integer.toString(321);
		//int �ڷ����� �� -> 2������ ���·�(String)
		String num2 = Integer.toBinaryString(5);
		
		//String -> �⺻�����ΰ����� ���̷�Ʈ�δ� ����� ��ü���� ���ľ��Ѵ�.
		//String -> ��ü�� -> �⺻��
		
		String k = "345.67";
		
	}
}
