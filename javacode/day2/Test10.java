package day2;

public class Test10 {
	public static void main(String[] args) {
		
		int score = 59;

		if(score++ >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

		System.out.println(score);

	}
}