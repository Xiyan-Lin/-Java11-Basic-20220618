package day2;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入姓名(String):");
		String name = scanner.next();
		
		System.out.print("請輸入年齡(int):");
		int age = scanner.nextInt();

		System.out.print("請輸入身高(double):");
		double h = scanner.nextDouble();

		System.out.print("是否是學生(boolean):");
		boolean b = scanner.nextBoolean();

		System.out.printf("姓名: %s\n", name);
		System.out.printf("年齡: %d\n", age);
		System.out.printf("身高: %.1f\n", h);
		System.out.printf("學生: %b\n", b);

	}
}