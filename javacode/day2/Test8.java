package day2;

public class Test8 {
	public static void main(String[] args) {
		// 關係與條件運算子
		// 關係運算子: ==, !=, >, >=, <, <=
		// 條件運算子: &&(短路), &, ||(短路), |, !
		int score = 75;
		System.out.println(score);

		// 1.成績是否及格 ? 用到關係運算子
		if (score >= 60) {
			System.out.println("成績及格");
		} else {
			System.out.println("成績不及格");
		}

		// 2.成績是否是五的倍數 ? 用到關係運算子
		if (score % 5 == 0) {
			System.out.println("成績是5的倍數");
		} else {
			System.out.println("成績不是5的倍數");
		}

		// 3.成績是否及格以及(and)是否是5的倍數 ? 用到關係運算子與條件運算子
		if ( (score >= 60) && (score % 5 == 0) ) {
			System.out.println("成績及格也是5的倍數");
		} else {
			System.out.println("不滿足條件");
		}

		// 4.成績是否及格或(or)是否是5的倍數 ? 用到關係運算子與條件運算子
		if ( (score >= 60) || (score % 5 == 0) ) {
			System.out.println("或成績及格或是5的倍數");
		} else {
			System.out.println("不滿足條件");
		}

		// 5. 沒有 不及格
		if (!(score < 60)) {
			System.out.println("沒有 不及格");
		} else {
			System.out.println("有 不及格");
		}
	}
}