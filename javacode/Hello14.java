/*
BMI 計算與判斷
身高: 172 體種: 56.8
試問BMI = ?
若 bmi 值 <= 18 顯示 "過輕"
若 bmi 值 > 23 顯示 "過重"
若 bmi 值介於 18~23(含)之間 顯示 "正常"
請使用 ?: 計算
*/
public class Hello14 {
	public static void main(String[] args) {
		var h = 172;
		var w = 56.8;
		var bmi = w / Math.pow(h/100.0, 2);
		var bmiText = bmi <= 18 ? "過輕" : bmi > 23 ? "過重" : "正常";
		System.out.printf("bmi = %.1f %s\n", bmi, bmiText);
	}	
}