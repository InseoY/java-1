package sub1;

/*
 * ��¥ : 2019/10/17
 * �̸� : ��ö��
 * ���� : Ŭ���� ��� �ǽ��ϱ� ���� p288
 */
public class InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kw = new StockAccount("Ű������", "121-11-1231", "������", 100000, "�Ｚ����", 10, 30000);
		kw.deposit(30000);
		kw.buy(15);
		kw.sell(5);
		kw.info();
		
		SmartPhone iphone = new SmartPhone("A10", "4GB", "128GB", "iphone 10", "010-1234-1234", 100);
		SmartPhone galaxy = new SmartPhone("2.3GHz", "4GB", "516GB", "galaxy s10", "010-1234-2231", 110);
		
		iphone.info();
		iphone.call();
		iphone.internet();
		
		galaxy.info();
		galaxy.call();
		galaxy.calc();
		
	}
}




















