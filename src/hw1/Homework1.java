package hw1;

public class Homework1 {

//	請設計一隻Java程式,計算12,6這兩個數值的和與積
//	Ans:

	public static void main(String[] args) {
		int a = 12, b = 6;

		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println("==========");

//	請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
//	Ans:
		
		//原始蛋數為 eggs
		int eggs = 200;

		// eggs1為 "打"
		int eggs1 = eggs / 12;

		// eggs2為 "顆"
		int eggs2 = eggs1 * 12;

		System.out.println(eggs1 + "打" + eggs2 + "顆");
		System.out.println("==========");

//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒	
//	Ans:
		
		//原始秒數為 sec
		int sec = 256559;

		//days 天
		int days = sec / (60 * 60 * 24);

		//hr 小時
		int hr = (sec % (60 * 60 * 24)) / 3600;
		
		//min 分鐘
		int min = ((sec % (60 * 60 * 24)) % 3600) / 60;
		
		//sec1 剩餘秒數
		int sec1 =(((sec % (60 * 60 * 24)) % 3600)) % 60;
		
		System.out.println("天數 :" + days + "天");
		System.out.println("小時 :" + hr + "小時");
		System.out.println("分鐘 :" + min + "分");
		System.out.println("秒數 :" + sec1 + "秒");
		
		System.out.println("==========");

//		請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//		Ans:

		// 半徑為r
		double π = 3.1415, r = 5;

		// 圓面積計算
		double area = π * Math.pow(r, 2);

		// 圓周長計算
		double c = 2 * (π * r);

		System.out.printf("圓面積 = %.2f%n", area);
		System.out.printf("圓周長 = %.2f%n", c);
		System.out.println("==========");

//		某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢(用複利計算,公式請自行google)		
//		Ans:

		// deposit = 原始存款
		int deposit = 1_500_000; 
		
		// ir = 利率
		double ir = 0.02; 
		
		//複利計算, d = 複利後的金額
		double d = deposit * Math.pow(1 + ir, 10);
		System.out.printf("共 %.0f 元%n", d);
		System.out.println("==========");
		
//		請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		Ans:
		
		//以下答案為10的原因為: 5 + 5 整數相加。
		System.out.println(5 + 5);   
		
		//以下答案為58的原因為:unicode嗎? 
		System.out.println(5 + '5');
		
		//以下答案為55的原因為: 第一個5為整數，第二個5表示字串，與前方的5串在一起。
		System.out.println(5 + "5");

		
	}

}
