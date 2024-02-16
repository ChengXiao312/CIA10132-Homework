package hw7;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Homework7 {

	public static void main(String args[]) {

//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

		int byteCount = 0;
		int charCount = 0;
		int lineCount = 0;
		try (

				FileInputStream fis = new FileInputStream(
						"C:\\CIA101_Workspace\\CIA10132-Homework\\src\\hw7\\Sample.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
			int i;
			while ((i = br.read()) != -1) {
				byteCount++;
				charCount++;
				if (i == '\n') {
					lineCount++;
				}
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println('\n');
		System.out.println("此檔案共有" + byteCount + "位元組，" + charCount + "個字元組，" + lineCount + "列資料");

//		• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)
		Set<Integer> set = new HashSet();
		while (set.size() != 10) {
			int r = (int) (Math.random() * 1000) + 1;
			set.add(r);
		}

		try {
			FileWriter fw = new FileWriter("C:\\CIA101_Workspace\\CIA10132-Homework\\src\\hw7\\Data.txt", true);

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);

			pw.println("----------------------------");

			for (Integer xx : set) {
				pw.println(xx);
			}

			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
