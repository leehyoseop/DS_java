//����� Class : ���α׷� ������ ���� main() method�� �����ϴ� ����
public class OMain4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName = "ȫ�浿";
		s.StudentAddress = "������";
		System.out.println("s�� Student ��ü�� ����");
		System.out.println(s);
		s.showStudentInfo();
		s.printInfo();
		System.out.println("=====================");
		Student s1 = new Student();
		s1.studentName = "��浿";
		s1.StudentAddress = "������";
		System.out.println("s1�� Student ��ü�� ����");
		System.out.println(s1);
		s1.showStudentInfo();
		s1.printInfo();
	}
}
