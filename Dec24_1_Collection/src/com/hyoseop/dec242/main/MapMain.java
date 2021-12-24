package com.hyoseop.dec242.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Map �迭
//		��������� ����
//		<key, value>
//		Key���� ����
//		�������� X
//
public class MapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("�Ƹ޸�ī��", 4000);
		hm.put("������", 5000);
		hm.put("�����̵�", 6000);
		hm.put("������", 7000);	//������ key���� ���� ������ ���� �������� ����� value������ ������
		
		System.out.println(hm.get("������"));
		Set<String> k = hm.keySet();
		for (String string : k) {
			System.out.println(string);
			System.out.println(hm.get(string));
		}
		
		//Java�� �ַ��� Arraylist
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(123);
		a1.add(1011);
		a1.add(2352315);
		a1.add(1);
		a1.add(11312312);
		a1.add(1);
		a1.add(123333);
		
		//�ߺ��� ���ְ� ������ 
		HashSet<Integer> hs2 = new HashSet<Integer>(a1);
		a1 = new ArrayList<Integer>(hs2);
		//�ߺ����� ������ ������ ���׹��׵ȴ�.
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		
		//������ ���·� ����ϰ� �ʹٸ�
		a1.sort(c);
		for (Integer integer : a1) {
			System.out.println(integer);
		}
	}
}
