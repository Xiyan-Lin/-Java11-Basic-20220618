package day3;

/*
	利用 for 步進迴圈印出
	*
	**
	***
	****
	*****
*/
public class Loop7 {
	public static void main(String[] args) {
		int amount = 100;
		for(int x = 1 ; x <= amount ; x++) {
			// 印空白
			
			for(int y = 1 ; y <= amount-x ; y++) {
				System.out.print(" ");
			}
			
			// 印 *
			for(int y = 1 ; y <= x ; y++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}