//Coder : ������
// Programmer : Coder + ���� 

//OOP + OOD(Object Oriented Design) ��ü ���� ������
//		�ǻ�Ȱ�� ������
public class OMain6 {
	//�ǻ� (�̸�, ����)
	
	//�մ� (�̸�, ����)
	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.Name = "��ȿ��";
		d.age = 56;
		
		Patient p = new Patient();
		p.Name = "��ȿ��";
		p.age = 16;
		
		d.printInfo();
		p.printInfo();
		
	}
}
