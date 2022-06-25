package day2;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		/*
			A	10	臺北市
			F	15	新北市
			H	17	桃園市
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入地區代號(A,F,H,10,15,17): ");
		// intern() 將字串放入到 String pool 共用池中
		String code = scanner.next().intern();
		if (code == "A" || code == "10") {
			System.out.println("台北市");
		} else if (code == "F" || code == "15") {
			System.out.println("新北市");
		} else if (code == "H" || code == "17") {
			System.out.println("桃園市");
		} else  {
			System.out.println("錯誤代碼");
		}
		
	}
}