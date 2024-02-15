package hw4;

public class Homework4 {

//	• 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素(提示:陣列,length屬性)
	
	public static void main(String[] args) {
		
		int[] intArray= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i<intArray.length; i++)
			sum += intArray[i];
		
		int avg = sum/intArray.length;
		System.out.println("平均為:" + avg);
		
		int It = 0;
		for (int i = 0; i<intArray.length; i++) {
			if (intArray[i] > avg) {
		
		System.out.print("大於平均值:" + intArray[i] + "\t");}
		}
		
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH(提示:String方法,陣列)
		
		
		
		
	}
}
