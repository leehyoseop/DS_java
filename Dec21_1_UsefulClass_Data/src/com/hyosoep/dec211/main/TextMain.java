package com.hyosoep.dec211.main;

import java.util.StringTokenizer;

public class TextMain {
	//����
	//	1.8.12
	//	���ڸ� major(1)
	//	���ڸ� minor(8.12)
	//		�� ���ڸ��� ������ �� minor
	//	������(1.8.12 -> 1.8.13) : ��¦ ����
	//	������(1.8.12 -> 1.9.0) : ��ȭ�� ������� ������ ����
	//	������(1.8.12 -> 2.0.0) : ���ο� ���α׷�
		
	// ��Ʈ��ũ�� ���ؼ� �����͸� �޾ƿ��� : ��������
	// ��Ʈ��ũ�� ���ؼ� �����͸� �ٶ� : ��������
	// �ѱ�ó���ϱⰡ ��ٷο�...
	public static void main(String[] args) {
		String s1 = "���ƾƾƾƾƾƾƾ�";//�⺻��X, ����̴�! 
		
		String s2 = new String("�� ������ ũ��������! �ʹ� �ų���!");
		
		//s2���� 3��°�� �ִ� ���ڸ� ���
		System.out.println(s2.charAt(2));
		
		String result = s2.replace(" ", "");
		
		System.out.println(result.length());
		
		System.out.println(s2.startsWith("��"));
		
		System.out.println(s2.contains("! ��"));
		
		System.out.println(s2.replace("ũ��������", "����"));
		
		System.out.println(s2.substring(1, 5));
		
		//String ��ü�� �����ϴµ� ������ ��Ƽ� 
//		String s3 = String.format("���� : %2.f kg", 123.456789);
//		System.out.println(s3);
		
		//s2�� ���� �߰�
		s2 = s2 + "���⿡�� ��� �� �� ������ ���ھ��!";
		System.out.println(s2);
		s2 += " ��� ���� �Ǽ��� ^-^";
		s2 = new String(s2 + "��������");
		
		//String �뷮���� �߰��ϱ� =====
		StringBuffer sb = new StringBuffer(s2);
		sb.append("���� �����ϵ� ���� ���� ���� ���ּ���!");
		sb.append("��������");
		sb.append("�ٵ� �ָ����� ���ؾߵǿ�!");
		System.out.println(sb);
		
		String s4 = sb.toString();
		
		String s5 = "����,�ں��,�ֺ��,�����";
		//1.split ===============
		String[] s5Ar = s5.split(",");
		System.out.println(s5Ar);
		
		//2.StringTokenizer ===============
		StringTokenizer st = new StringTokenizer(s5,",");//��� ����� �� �ִ�.
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) {	//�ݺ�������(while�� + ������� ����!)
			System.out.println(st.nextToken());
		}
		
		String a = "I,My,,Me,Mine";
		a.replace(",,", ",");

		System.out.println("-----");
		String[] aArr = a.split(",");
		for (String string : aArr) {
			System.out.println(string);
		}
		
		StringTokenizer aSt = new StringTokenizer(a, ",");
		while (aSt.hasMoreTokens()) {
			System.out.println(aSt.nextToken());
		}
		
	}
}
