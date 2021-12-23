package com.hyoseop.dec231.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.hyoseop.dec224.httpclient.HSHTTPclient;

public class NaverNewsMain {
	public static void main(String[] args) {
		//ID : xe8dvgD91K1ZJRMPlGtm
		//Secret : 1C8Zz5aaw6
		// ���ͳ� �ּ�ü��
		//		-> �ѱ�, Ư�����ڰ� �ٷ� ���� �ȵ�
		//		-> '��' => %2D (URL���ڵ�)
		
		// ��������:// - ��Ź��
		// 	��ǻ���� �ּ�/
		//	������/������/..../���ϸ�
		//https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&qvt=0
		//&query=%ED%86%A0%ED%8A%B8%EB%84%98%20%ED%99%8B%EC%8A%A4%ED%8D%BC%20FC
		//	������=��&������=��&������=��... -> ��û�Ķ���� : Ŭ���̾�Ʈ�� ��������
		//		-> ��û �Ķ���� : Ŭ���̾�Ʈ�� �������� ���������� ������ ����
		//
		
		try {
			Scanner k = new Scanner(System.in);
			System.out.println("�˻��� : ");
			String search = k.nextLine();
			System.out.println(search);
			//�˻�� URL���ڵ��ϱ�
			search = URLEncoder.encode(search, "utf-8");
			System.out.println(search);
			
			String address = "https://openapi.naver.com/v1/search/kin.xml";
			address += "?query=" + search;
			//InputStream is = HSHTTPclient.download(address);
//			URL u = new URL(address);
//			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
//			//��û ���
//			huc.addRequestProperty("X-Naver-Client-Id", "xe8dvgD91K1ZJRMPlGtm");
//			huc.addRequestProperty("X-Naver-Client-Secret", "1C8Zz5aaw6");
//			InputStream  is = huc.getInputStream();
//			String t = HSHTTPclient.convert(is, "utf-8");
//			System.out.println(t);
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id", "xe8dvgD91K1ZJRMPlGtm");
			headers.put("X-Naver-Client-Secret", "1C8Zz5aaw6");
			InputStream is = HSHTTPclient.download(address, headers);
			//String t = HSHTTPclient.convert(is, "utf-8");
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			boolean data = false;
			
			String a = null;
			
			while (type!=XmlPullParser.END_DOCUMENT) {
				if (type ==XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						data = true;
					}
				} else if (type == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
							a = xpp.getText();
							a = a.replace("<b>", "");
							a = a.replace("</b>", "");
							System.out.println(a);
						} else if (tagName.equals("description")) {
							System.out.println(xpp.getText());
						}
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
