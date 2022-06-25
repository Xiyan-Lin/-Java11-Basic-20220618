package day2;

public class Test6 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);
		// 數學運算其結果會自動轉型為 int
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		System.out.println(c);
	}
}