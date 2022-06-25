package day2;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		// 判斷分數 level
		// 90~100 -> A	
		// 80~89  -> B
		// 70~79  -> C	
		// 60~69  -> D	
		// 0~59   -> E
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數: ");
		int score = scanner.nextInt();
		// 判斷 level
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");	
		} else if(score >= 70 && score < 80) {
			System.out.println("C");	
		} else if(score >= 60 && score < 70) {
			System.out.println("D");	
		} else if(score >= 0 && score < 60) {
			System.out.println("E");	
		} else {
			System.out.println("分數錯誤");
		}

	}

}