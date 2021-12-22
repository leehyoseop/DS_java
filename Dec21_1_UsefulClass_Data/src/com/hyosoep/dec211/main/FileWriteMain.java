package com.hyosoep.dec211.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//CPU	: ������ġ
//RAM	: ������ġ(�ӽ�) - ������ϸ� ���ư�
//			static / stack - ���α׷��� ����(�����ϸ�) ���ư�
//			heap : �ڵ����� ���ư� X (GC������ �ڵ����� ���ư�)
//HDD(SSD)	: ������ġ(����) (���� -> DB)
//GPU	: �׷���ó���� (CPU +RAM + HDD)

//���α׷������� �����͸� �ܺο��� �а�, �ٽ� �ܺη� ����ϴ� �۾��� ���� �Ͼ�µ�
//�����ʹ� ����ڷκ��� Ű���带 ���ؼ� �Էµ� ���� �ְ�(Scanner), ����-��Ʈ��ũ������ �Էµ� �� �ִ�.(Input)
//�ݴ�� �����ʹ� ����͸� ���ؼ� ��µ� ���� �ְ�, system.out.println
//����.��Ʈ��ũ�ε� ��µ� �� ����! output

public class FileWriteMain {
	public static void main(String[] args) {
		//System.out -> outputstream
		//system.in -> inputstream
		//Stream : ���� -> 
		
		//�⺻�� : 
		//inputstream(��ġ | Ű����,����,��Ʈ��ũ ���α׷����� �Է�) 1����Ʈ�� �����ִ� ����
		//inputstreamreader ��ġ -> ���α׷� 2byte��
		//bufferedreader 1String - line ���� ũ�� Up! 
		//OutputStream : ���α׷��� ����� ��ġ�� ���
		//OutputStreamWriter : 2byte��
		//BufferedWriter : 1String -Line
		
		//������ (Ư�������� �°�) :
		//PrintStream (OutputStream ����) - ���� ���ϰ� ������ �޼ҵ带 �߰�
		//FileReader (InputStreamReader ����) - ���Ͽ��� �����͸� �о���� ���ϰ�
		//FileWriter (OutputStreamWriter ����)
		Scanner k = new Scanner(System.in);
		System.out.print("�� : ");
		String cmt = k.next();
		
		System.out.println("----------");
		//FileWriter
		//		���α׷� -> ����(OutputStreamWriter�� ������)
		//		������ ������ ����� �ֱ⵵ ��
		//		������ �ȸ������
		//		Linux�� ��δ� /�� �����ϰ� Window�� \\�� ��� �����Ѵ� / �ε� �����ϴ�
		
		//fw���� bw�� ������ ����
		//������ �͵� �߿��� �ϳ��� ������ �� ó��
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("C:\\Users\\wtime\\Desktop\\java\\HHHHH.txt", true);
			
			//�� ����Ʈ�� ������ϱ� ���ٴ� "����"�� �̿��ؼ� �ѹ��� ���� ����Ʈ�� ������ϴ� ���� ����
			// ���� => ��κ��� ����� �۾����� ��� ���۴� CPU�� HDD������ ����
			//���۸� -> �����͸� ���۷� �����ϴ� ����
			//		=>���༺�� ��� ��ų �� ���� 
			bw = new BufferedWriter(fw);
			bw.write(cmt + "\r\n");
			bw.write("kkkkkkkkkk");
			bw.flush();// �뷮�� �� ��ä������ ���������� ��������.(��� ������ �� ������)
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
