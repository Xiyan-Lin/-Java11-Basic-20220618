package day2;

public class Test4 {
	public static void main(String[] args) {
		// 轉型
		int x = 100;
		long y = x;  // 小轉大 int -> long, 自動執行
		System.out.println(x);
		System.out.println(y);

		long a = 100;
		int b = (int)a; // 大轉小 long -> int, 強制轉型
		System.out.println(a);
		System.out.println(b);
	}
}