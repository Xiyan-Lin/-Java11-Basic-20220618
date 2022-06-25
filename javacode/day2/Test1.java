package day2;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Hello day2");
		// before Java 11
		byte b1 = 100;     // -128 ~ +127
		short s1 = 1_5000; // -32768 ~ 32767
		int t1 = 100_0000; // -21億 ~ +21億
		long g1 = 5_0000_0000_0000L; // -900京~+900京
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(t1);
		System.out.println(g1);
		// after Java 11(含)
		var b2 = 100;
		var s2 = 1_5000;
		var t2 = 100_0000;
		var g2 = 5_0000_0000_0000L;
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(t2);
		System.out.println(g2);

	}
}
