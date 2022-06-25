package day2;

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		/*
			A	10	臺北市
			F	15	新北市
			H	17	桃園市
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入地區代號(A,F,H,10,15,17): ");
		String code = scanner.next().intern();
		// 改寫使用 switch-case
		switch(code) {
			case "A":
				System.out.println("台北市");
				break;
			case "10":
				System.out.println("台北市");
				break;	
			case "F":
				System.out.println("新北市");
				break;	
			case "15":
				System.out.println("新北市");
				break;		
			case "H":
				System.out.println("桃園市");
				break;	
			case "17":
				System.out.println("桃園市");
				break;		
			default:
				System.out.println("錯誤代碼");
		}

	}
}