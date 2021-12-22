package com.hyoseop.dec223.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SCMain {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("192.168.1.46", 8899);//����ip, ��Ʈ�ּ�
			System.out.println("�����!");
			
			Scanner k  = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				System.out.printf("ȿ�� =>%s\n", br.readLine());
				System.out.println("���� =>");
				String msg = k.next();
				bw.write(msg+"\n");
				bw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
