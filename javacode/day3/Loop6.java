package day3;

// for 步進迴圈
// 九九乘法表
public class Loop6 {
	public static void main(String[] args) {
		for(int x = 1 ; x <= 9 ; x++) {

			for(int y = 1 ; y <= 9 ; y++) {
				System.out.printf("%dx%d=%d ", x, y, (x*y));
			}
			System.out.println();

		}
		
	}
}