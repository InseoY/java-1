package sub2;

/*
 * 날짜 : 2019/10/10
 * 이름 : 김철학
 * 내용 : 변수의 자료형(데이터 타입) 실습하기
 */
public class DataTypeTest {
	
	public static void main(String[] args) {
		// 정수형
		byte  var1 = 127;
		short var2 = 2;
		int   var3 = 2147483647;
		long  var4 = 9223372036854775807L;
		
		// 실수형
		float  var5 = 1.123456789f;
		double var6 = 1.1234567890123456789;
		
		// 논리형
		boolean var7 = true;
		boolean var8 = false;
		
		// 문자형
		char ch1 = 'A';
		char ch2 = '가';
				
		// 문자열(단어)
		String str1 = "A";
		String str2 = "Apple";
		String str3 = "사과";
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
	}	
}
