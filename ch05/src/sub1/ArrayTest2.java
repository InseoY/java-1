package sub1;

/*
 * ��¥ : 2019/10/15
 * �̸� : ��ö��
 * ���� : ������ �迭 �ǽ��ϱ�
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		
		// 1���� �迭
		int[] score = {80, 60, 78, 69, 87, 92, 88, 96};
		
		int sum = 0;
		
		for(int i=0 ; i<6 ; i++) {
			
			sum += score[i];
		}
		
		System.out.println("������ ���� : "+sum);
		System.out.println("������ ��� : "+sum/score.length); // �迭�� ����
		
		// �迭�� �ݺ���
		int jumsu[] = {10, 20, 30, 40, 50, 60};
		int total = 0;
		
		for(int n : jumsu) {
			total += n;
		}
		
		System.out.println("jumsu�� �� : "+total);
		
		// 2���� �迭
		int arr[][] = {{ 1,  2,  3}, 
					   { 4,  5,  6}, 
					   { 7,  8,  9}, 
					   {10, 11, 12}};
		
		
		for(int a=0 ; a<4 ; a++) {
			
			for(int b=0 ; b<3 ; b++) {
				System.out.println("arr["+a+"]["+b+"] = "+arr[a][b]);		
			}
			
		}
		
		int arr3[][][] = {};
		
	}
}

















