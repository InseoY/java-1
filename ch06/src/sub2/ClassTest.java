package sub2;

/*
 * ��¥ : 2019/10/16
 * �̸� : ��ö��
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� 
 */
public class ClassTest {

	public static void main(String[] args) {
		
		// �������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-11-1234", "������", 10000);
		
		// ���Ȱ��
		kb.deposit(20000);
		kb.withdraw(5000);
		//kb.money -= 1; // ����ڵ� -> ��������� ĸ��ȭ(private)�� ���� ����ڵ� ����
		
		kb.info();
		
		// �츮���� ��ü���� �� �ʱ�ȭ
		Account wr = new Account("�츮����", "121-12-1234", "������", 10000);
		
		// ���Ȱ��
		wr.deposit(10000);
		wr.withdraw(7000);
		wr.info();
		
		
		// ��ǻ�� ��ü����
		Computer samsung = new Computer("INTEL i7", "8GB", "1TB");
		Computer imac    = new Computer("INTEL i5", "4GB", "512GB");
		
		samsung.info();
		samsung.calc();
		samsung.internet();
		
		imac.info();
		imac.calc();
		imac.internet();
	}
}









