package com.hyoseop.dec224.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

//���
//	HTTP - Ŭ���̾�Ʈ�� ��û�� �ϸ� ������ �� ��û�� �°� ����
//	Socket��� - �ǽð� ��� (�� �����ʹ� ������� �������۱��)

//Java���� HTTPClient����� ������->������ �߾�� �ߴµ�...�Ф�
//�ٸ� �����ڰ� �����ؼ� ������ �س���^_^
//���� ����� ������ �� ���� �ȴ�!!!

//apache.org - httpcomponents - download 4.5.13.zip(binary)

public class HMain1 {
	//������ ����
	
	public static void main(String[] args) {
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// ��û - GET(�⺻) or POST
			HttpGet hg = new HttpGet("https://www.naver.com");
			// ����
			System.out.println(hg);
			HttpResponse hr = dhc.execute(hg);
			System.out.println(hr);
			// ���� ����
			HttpEntity he = hr.getEntity();
			System.out.println(he);
			// �� ������ ������ �� �ִ� ����
			InputStream is = he.getContent();
			
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
//			String line = null;
//			while ((line = br.readLine())!= null) {
//				System.out.println(line);
//			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
