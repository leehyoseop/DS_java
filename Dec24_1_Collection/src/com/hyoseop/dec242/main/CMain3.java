package com.hyoseop.dec242.main;

import java.util.HashMap;
import java.util.Scanner;

import com.hyoseop.dec242.student.Student;

public class CMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = k.next();
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("����", new Student("����", 30, 30, 10));
		students.put("����", new Student("����", 40, 40, 10));
		students.put("����", new Student("����", 50, 50, 10));
		students.put("����", new Student("����", 60, 60, 10));
		
		students.get(name).printInfo();
	}
}
