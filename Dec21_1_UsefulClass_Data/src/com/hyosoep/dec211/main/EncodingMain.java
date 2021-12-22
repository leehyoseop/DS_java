package com.hyosoep.dec211.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EncodingMain {

	// Encoding : ������ ���³� ������ ��ȯ�ϴ� ó���� ó�����
	// ��ǻ�� : ���ڱ�� (���Ⱑ �帣�ų� ���帣�ų�)
	// '��'->������ �帧���� ǥ��(�𽺺�ȣ) -> Encoding

	// Decoding : ���ڵ��� ������ ��� ���� �� ������ ���� ���·� ��ȯ
	// ������ �帧->'��'
	// encoding ��������������� ����!
	// ũ��������-A->1010-A->ũ��������
	// ũ��������-B->0101-B

	// ������������ �ַ� : UTF-8(unicode transform format)
	// �ѱ��� Ÿ�� : EUC-KR
	// MS���� : MS949

	// 9ȣ�� -UTF-8 -> 1011 - MS949 -> ??

	public static void main(String[] args) {
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("C:\\Users\\wtime\\Desktop\\java\\hyoseop.txt", true);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		OutputStreamWriter osw = null;
//		try {
//			osw = new OutputStreamWriter(fos, "utf-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		BufferedWriter bw = new BufferedWriter(osw);
//		try {
//			bw.write("leehyoseop zzang");
//			bw.append("\r\n");
//			bw.append("������ ������!!!" + "\r");
//			bw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\wtime\\Desktop\\java\\hyoseop.txt");

			InputStreamReader isr = new InputStreamReader(fis, "utf-8");

			br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}