package com.hyoseop.dec242.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.hyoseop.dec242.student.Student;

public class CMain2 {
	public static void main(String[] args) {
		//�л��� ��ȣ�� �Է��ϸ� 
		Scanner k = new Scanner(System.in);
		System.out.println("��ȣ : ");
		int no = k.nextInt();
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("����", 30, 30, 10));
		students.add(new Student("����", 40, 40, 10));
		students.add(new Student("����", 50, 50, 10));
		students.add(new Student("����", 60, 60, 10));
		
		//�ش� ��ȣ �л��� ��ü������ ��µ� �� �ְ�
		students.get(no-1).printInfo();
		System.out.println();
		System.out.println(students.get(no-1).getEng());
		
		for (int i = 0; i < students.size(); i++) {
			//������
			System.out.println(students.get(i));
			students.get(i).printInfo();
		}
	}
}
