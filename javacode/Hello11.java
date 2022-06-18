/*
資料印出一般使用 System.out.print()
資料印出格式化使用 System.out.printf()
字串  整數  浮點數
 %s   %d     %f

*/
public class Hello11 {
	public static void main(String[] args) {
		var x = 123456789;
		var y = 987654321.5678;
		System.out.printf("%,d\n", x);
		System.out.printf("%,f\n", y);
		System.out.printf("%,.2f", y);
	}
}