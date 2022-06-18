/*
設計一個 BMI 計算程式
用法:
java Hello9 170.0 60.5 <- 170.0(身高cm), 60.5(體重kg)
執行結果: BMI = 23.xxx
技巧:
字串轉浮點數 Double.parseDouble("170.0") 得到 170.0
字串轉浮點數 Double.parseDouble("60.5") 得到 60.5
*/
public class Hello9 {
	public static void main(String[] args) {
		var h = Double.parseDouble(args[0]); // cm
		var w = Double.parseDouble(args[1]); // kg
		h = h/100.0; // 以 m 為單位
		var bmi = w / (h*h);
		System.out.print("BMI = ");
		System.out.println(bmi);
	}
}