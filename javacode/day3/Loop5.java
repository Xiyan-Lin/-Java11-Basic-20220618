package day3;

// for 步進迴圈
public class Loop5 {
	public static void main(String[] args) {
		// 印出 1~10
		for(int x = 1 ; x <= 10 ; x++) {
			System.out.println(x);
		}

		// 印出 1~10 (間隔 2)
		for(int x = 1 ; x <= 10 ; x+=2) {
			System.out.println(x);
		}
	}
}