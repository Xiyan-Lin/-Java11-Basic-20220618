package day3;

import java.util.Random;
import java.util.Scanner;

// 寫一個 1~9 猜大小的程式
// 一共有 3 次機會
public class Loop3 {
	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(9) + 1; // 0~8 + 1
		int count = 3;
		do {
			System.out.print("1 ~ 9 猜一數字: ");
			Scanner scanner = new Scanner(System.in);
			int guess = scanner.nextInt();
			if (guess > ans) {
				System.out.println("猜大了");
				continue; // 重新執行 while 判斷
			} else if (guess < ans) {
				System.out.println("猜小了");
				continue; // 重新執行 while 判斷
			} else {
				System.out.println("答對了");
				break;
			}
		} while(--count > 0);
		// 遊戲結束
		System.out.println("Game over!!");
	}
}