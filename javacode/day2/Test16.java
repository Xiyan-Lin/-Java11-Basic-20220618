package day2;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		// 建立基本輸入輸出物件
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身高(cm): ");
		// 取得使用者所輸入的浮點數資料
		double h = scanner.nextDouble();
		System.out.print("請輸入體重(kg): ");
		// 取得使用者所輸入的浮點數資料
		double w = scanner.nextDouble();

		System.out.printf("您所輸入的身高: %.1f\n", h);
		System.out.printf("您所輸入的體重: %.1f\n", w);
		

	}
}