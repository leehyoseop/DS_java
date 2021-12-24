package com.hyoseop.dec242.main;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMain {
//ArrayList
//	��Ҹ� �ε����� ����ϴ� ���� �迭�� ����
//�迭 : ����� ���� -> �������� ���� �迭�� ũ�⺸�� �������� ������ �Ұ���
//ArrayList : ����Ǵ� �������� ���� ���� ũ�Ⱑ �ڵ������� ����
//		��Ұ� �������� �Ǹ� ArrayList�� ũ�⸦ �������� ������Ű�� �� �ݴ뵵 ����������...
//		�ڷ����� ��� ������ �ִ°� ����
//<�ڷ���> => generic
//		�ڷ����� �����ϴ� ����
//		Ŭ������(�ڷ����� ��ü��) ���� ������...
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add("�̺�");
		test.add(1224);
		test.add("ũ��������");
		test.add(12.25);
		for (Object object : test) { //�ڷ����� ���ϵ��� �ʾƼ� object��°� �򰥸�..
			System.out.println(object);
		}
		
		ArrayList<String> a1 = new ArrayList<String>();
		//al.add("��");
		//al.add(1);
		
		ArrayList<Integer> a12 = new ArrayList<Integer>();
		a12.add(new Integer(100));
		a12.add(50);
		
		System.out.println(a12.get(0));
		System.out.println(a12.size());
		a12.add(0, null); //1���ڸ��� 90 �ֱ� �ڿ����� �и���.
		a12.set(0, null); //2���ڸ��� 0���� �ٲٱ�
		a12.remove(0); //0���ڸ��� �ִ� �� �����
		
		a1.add("��");
		a1.add("���");
		a1.add("����");
		a12.add(400);
		a12.add(2173);
		a12.add(300);
		
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		a1.sort(c);
		for (String s : a1) {
			System.out.println(s);
		}
		Comparator<Integer> c2 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);//��������
			//	return o2.compareTo(o1);//��������
			}
		};
	}
}
