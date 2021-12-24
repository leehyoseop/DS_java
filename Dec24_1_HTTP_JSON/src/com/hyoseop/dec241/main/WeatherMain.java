package com.hyoseop.dec241.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.hyoseop.dec224.httpclient.HSHTTPclient;

//AJAX - JavaScript���� XML�Ľ�
//		-> XML ���� �Ⱦ���...
//		-> JavaScript�� ģȭ�� ���� ������..?

//XML : �ְ� �޴°� ��ӵ� ����

//JSON(javascript object notation)
//		DB�� �ִ� �����͸� JavaScript���·� ǥ���� ��.
//		XML���ٴ� ��~~~�� ����(�е���)

//api.openweathermap.org/data/2.5/weather?q=Paris&appid=42008a8c8e7402a3fc9d3b1a7df8fee9

//ũ�� ������� -Jsonviewer�ٿ�
//Java�迭 : {1, 2, 3}
//JS�迭 : [1, 2, 3]
//Java��ü : Dog d = new Dog();
//			d.getName("����");
//			d.getAge(2);
//JS��ü : {name : "����", age : 2}

public class WeatherMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("City : ");
			String cityname = k.nextLine();
			cityname = URLEncoder.encode(cityname, "utf-8");
			System.out.println(cityname);
			String address = "https://api.openweathermap.org/data/2.5/weather";
			address += "?q="+ cityname;	//�����̸� �ֱ�
			address += "&appid=42008a8c8e7402a3fc9d3b1a7df8fee9";	//API key�ֱ�
			address += "&units=metric"; // �����µ��� ���
			address += "&lang-kr";
			System.out.println(address);
			InputStream is = HSHTTPclient.download(address);
			String str = HSHTTPclient.convert(is, "utf-8");
			System.out.println(str);
			
			JSONParser jp = new JSONParser();
			//��ü? �迭? - ��ȣ ����� ���� �Ǵ�
			// [ :�迭
//			JSONArray ja = (JSONArray)jp.parse(str);
//			System.out.println(ja);
			// { :��ü
			JSONObject jo = (JSONObject)jp.parse(str);
			System.out.println(jo);
			
			JSONObject sys = (JSONObject)jo.get("sys");
			System.out.println(sys);
			String country = (String)sys.get("country");
			System.out.println(country);
			
			String name = (String) jo.get("name");
			System.out.println(name);
			
			JSONArray ja2 = (JSONArray) jo.get("weather");
			JSONObject jo2 = (JSONObject) ja2.get(0);
			String description = (String) jo2.get("description");
			//��� ü���µ� ������� �ְ��� ��� ����
			
			//��� + ü���µ�
			JSONObject ja3 = (JSONObject) jo.get("main");
			double temp = (double)ja3.get("temp");
			double feel_like = (double)ja3.get("feels_like");			
			double temp_min = (double)ja3.get("temp_min");			
			double temp_max = (double)ja3.get("temp_max");			
			long pressure = (long)ja3.get("pressure");			
			long humidity = (long)ja3.get("humidity");			
			
			System.out.println(temp);
			System.out.println(feel_like);
			System.out.println(temp_min);
			System.out.println(temp_max);
			System.out.println(pressure);
			System.out.println(humidity);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
