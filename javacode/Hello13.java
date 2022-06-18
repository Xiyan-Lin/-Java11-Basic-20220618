// 判斷
// 三元運算子 ?:
public class Hello13 {
	public static void main(String[] args) {
		var score = 85;
		// 請判斷是否及格 ?
		var pass = score >= 60; // true 或 false 的布林值
		System.out.printf("分數: %d 及格: %b\n", score, pass);
		// 若 分數: 85 及格
		//    分數: 45 不及格
		var passText = score >= 60 ? "及格" : "不及格";
		System.out.printf("分數: %d %s\n", score, passText);
	}
}