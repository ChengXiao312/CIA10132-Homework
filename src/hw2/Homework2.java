package hw2;

public class Homework2 {

//	請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//	Ans:

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 1000; i++)
			if (i % 2 == 0)
				sum += i;
		System.out.println("1 ~ 1000 偶數和 = " + sum);
		System.out.println("==========");

//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//	Ans:

		int sum1 = 1;
		for (int a = 1; a <= 10; a++)
			sum1 = sum1 * a;
		System.out.println("1~10 連乘積(for迴圈) = " + sum1);
		System.out.println("==========");

//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)	
//	Ans:

		int sum2 = 1, b = 1;
		while (b <= 10) {
			sum2 *= b;
			b++;
		}
		System.out.println("1~10 連乘積(while迴圈) = " + sum2);
		System.out.println("==========");

//	請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
//	Ans:

		for (int c = 1; c <= 10; c++) {
			int aa = c * c;
		System.out.println(aa);
		}
		System.out.println("==========");

//	阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//	Ans:

		
		 for (int d = 1; d <= 49; d++) {
	            if (d / 10 != 4 && d % 10 != 4) {
	                System.out.println(d);
	            }
	        }
		 System.out.println("==========");

		
//	請設計一隻Java程式,輸出結果為以下:
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1
//	Ans:		

		int i1, i2;
		for (i1 = 10; i1 >= 1; i1--) {
			for (i2 = 1; i2 <= i1; i2++) {
				System.out.print(i2 + "");
			}
			System.out.println();
		}
		System.out.println("==========");

//		int i1,i2;
//		for(i1 = 1; i1 <= 10; i1++) {
//			for(i2 = 1; i2 <= i1; i2++) {
//				System.out.print(i2 + "");
//			}
//			 	System.out.println();
//		}

//	請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
//	Ans:

		char english = 'A';
		for (int i3 = 1; i3 <= 6; i3++) {
			for (int i4 = 1; i4 <= i3; i4++) {
				System.out.print(english);
			}
			english = (char) (english + 1);
			System.out.println();
		}
		System.out.println("==========");
	}
}
