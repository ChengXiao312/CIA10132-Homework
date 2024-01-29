package hw3;

import java.util.Scanner;

public class Homework3 {
//	• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
//	(提示:Scanner,三角形成立條件,判斷式if else)(進階功能:加入直角三角形的判斷)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("請輸入第一個數字");
		double side1 = scan.nextDouble();
		
		System.out.println("請輸入第二個數字");
		double side2 = scan.nextDouble();
		
		System.out.println("請輸入第三個數字");
		double side3 = scan.nextDouble();
	
		if(side1 == side2 && side2 == side3 && side3 == side1) {
			System.out.println("三角形");
		}else if(side1 == side2 || side2 == side3 || side3 == side1) {
			System.out.println("等腰三角形");
		}else if(side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1)
			System.out.println("其他三角形");
		
		else
			System.out.println("不是三角形");

//	• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//(提示:Scanner,亂數方法,無窮迴圈)(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		int a;
		a = (int) (Math.random() * 100);
		Scanner scan = new Scanner(System.in);
		System.out.println("開始猜數字:");
		
		int guess = 0;

		for (int i = 1; i != a;) {
			if (scan.hasNextInt()) {
				i = scan.nextInt();
				guess++;
			} else {
				System.out.println("請輸入整數！");
				break;
			}
			if (i == a) {
				System.out.println("答對了！答案就是" + a);
				System.out.println("您總共輸入了" + guess + "次才答對"  );
				break;
			} else if (i < a) {
				System.out.println("請輸入大於" + i + "的數字");
				System.out.println("猜錯囉！");
			} else if (i > a) {
				System.out.println("請輸入小於" + i + "正確答案");
				System.out.println("猜錯囉！");

				
			}
			
		}

//	• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
//(提示:Scanner)(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
//	• 透過Math類別的靜態方法random(),可以自動產生隨機的數字	

	}
}
//	Scanner用法
//	• 可以取得鍵盤輸入的內容,用法參考下圖所示:
//	• Scanner紅底字請移動滑鼠到錯誤處,點選Import ‘Scanner’即可
//	• 留意程式是否已終止 (沒亮紅燈)
