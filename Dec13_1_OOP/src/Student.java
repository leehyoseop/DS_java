//���̺귯���� Class(API:application Program Interface)
//				: �ٸ� Class���� �̿��� ����
//���α׷����� ����Ǵ� Class�� ������, �� �ϳ��� ����� ���� �� ���̺귯����;
//	���ܵƴ� �ϳ��� Class : �����
public class Student {
	//������� (Member variable) / �ʵ� (Field) : ��ü�� �����Ͱ� ����Ǵ� ��
//											������ ����ϰ� �������� ������ �ƴ�
//	-���� : ������, �޼ҵ� �������� ���ǰ�,
//			������, �޼ҵ��� ������ ����Ǹ� �Բ� �ڵ����� ����.

//	-�ʵ� : ������, �޼ҵ� ��ü���� ����� ����
//			��ü�� �Ҹ���� �ʴ� �� ��ü�� �Բ� ����
//	�ʱⰪ�� �������� ���� ��������� ��ü ������ �ڵ����� �⺻ �ʱⰪ�� ����.
	
	int studentID;
	String studentName;
	String StudentAddress;
	
	//method(�޼ҵ�) : ��ü�� ���ۿ� �ش��ϴ� ������
	//	�߰�ȣ ����� �ǹ� >> �̸� ���ΰ��� method�� (���罺���� ����)
	//	�޼ҵ带 ȣ�� ��, �� ���� ���� ��� �ڵ带 �ϰ������� ����.
	//	��ü ���� �����͸� ���� ����
	//	
	public void showStudentInfo() {
		System.out.println(studentName + " " + StudentAddress);
	}
	
	public void printInfo() {
		System.out.println(this.studentName);
		System.out.println(this.StudentAddress);
	}
}
