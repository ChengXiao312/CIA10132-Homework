package hw1;

public class Homework2 {

	public static void main(String[] args) {
		
		String str;
		
		
		str = "";
		a:
		for (int i = 3; i < 8; i++) {
		    if ( i == 4) break;
		    if (i == 6) break a ;
		    str += i;
		}
		System.out.println(str);
	}
}
