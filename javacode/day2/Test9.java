package day2;

public class Test9 {
	public static void main(String[] args) {
		//條件運算子: 短路型(&&, ||)與一般型(&, |)
		int x = 10;
		System.out.println("x = " + x);

		if ( (x > 10) && (++x > 0) ) {
			System.out.println("條件成立");
		} else {
			System.out.println("條件不成立");
		}
		
		System.out.println("x = " + x);


	}
}