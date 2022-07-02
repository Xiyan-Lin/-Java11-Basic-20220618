package day3;

import java.util.Random;

// 迴圈的應用
public class Loop1 {
	public static void main(String[] args) {
		Random random = new Random();
		while (true) {
			int n = random.nextInt(100); // 0~99
			if (n % 2 == 1) { // 若 n 是奇數
				continue;
			}
			System.out.println(n);
			if (n == 0) {
				break; // 離開迴圈
			} 
		}
	}
}