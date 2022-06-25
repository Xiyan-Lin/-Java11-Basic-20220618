package day2;

import java.util.Random; // 隨機數

public class Test21 {
	public static void main(String[] args) {
		Random random = new Random();

		while(true) {
			System.out.println(random.nextInt()); // 隨機整數
			System.out.println(random.nextInt(10)); // 0~9 的隨機整數
		}
		
	}
}