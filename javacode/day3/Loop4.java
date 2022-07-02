package day3;

// while 巢狀迴圈
public class Loop4 {

	public static void main(String[] args) {
		int count = 3;
		while(count-- > 0) { // 外層迴圈
			System.out.println(count);

			int amount = 5;
			while(amount-- > 0) { // 內層迴圈
				System.out.print("*");
			}
			System.out.println();

		}
	}

}