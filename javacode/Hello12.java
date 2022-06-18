public class Hello12 {
	public static void main(String[] args) {
		var text = "計算 bmi: ";
		var h = 1.724;
		var w = 61.38;
		var bmi = w / Math.pow(h, 2);
		System.out.printf("%s %.2f\n", text, bmi);
		System.out.printf("BMI = %.2f\n", bmi);

	}
}