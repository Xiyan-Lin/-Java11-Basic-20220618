/*
計算圓面積與球體積
執行: java Hello10 8 <- 半徑8
執行結果: 圓面積 = xx.xx 球體積 = xx.xx
請試作之
*/
public class Hello10 {
	public static void main(String[] args) {
		var r = Double.parseDouble(args[0]);
		var pi = Math.PI;
		var area = r * r * pi;
		//var volume = 4/3.0 * pi * r * r * r;
		var volume = 4/3.0 * Math.PI * Math.pow(r, 3);
		System.out.print("圓面積 = ");
		System.out.print(area);
		System.out.print(" 球體積 = ");
		System.out.println(volume);

	}
}